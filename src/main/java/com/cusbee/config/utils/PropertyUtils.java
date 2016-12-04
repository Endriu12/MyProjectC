package com.cusbee.config.utils;

import com.cusbee.config.exception.ApplicationException;
import com.cusbee.config.exception.BaseException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;


@Component(value = "PropertyUtils")
public class PropertyUtils {

	private static Properties properties;

	@PostConstruct
	public void init() throws IOException {
		Resource resource = new ClassPathResource("ErrorMessages.properties");
		properties = PropertiesLoaderUtils.loadProperties(resource);
	}
	
	public static String getProperty(int errorCode) {
		String returnValue = null;
		if (errorCode <= 0) {
			throw new ApplicationException("Invalid errorcode");
		}
		String errorCodeString = StringUtils.EMPTY + errorCode;
		if (properties != null) {
			returnValue = properties.getProperty(errorCodeString);
		}

		if (returnValue == null) {
			throw new ApplicationException(HttpStatus.BAD_REQUEST,
					errorCodeString);
		}
		return returnValue;
	}

	public static String getProperty(String propertyCode) {
		String returnValue = null;
		if (propertyCode == null) {
			throw new ApplicationException(
					ErrorCodes.Common.KEY_CANNOT_BE_EMPTY);
		}
		if (properties != null) {
			returnValue = properties.getProperty(propertyCode);
		}

		if (returnValue == null) {
			throw new ApplicationException(ErrorCodes.Common.NO_MAPPING_EXISTS,
					new String[] { propertyCode });
		}
		return returnValue;
	}

	public static String getProperty(int errorCode, String... dynamicValues)
			throws BaseException {

		String returnValue = PropertyUtils.getProperty(errorCode);

		return MessageFormat.format(returnValue, (Object[]) dynamicValues);

	}
}
