package com.cusbee.config.entity;

import com.cusbee.config.entity.enums.AccountType;
import com.cusbee.config.entity.enums.EmploymentType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Endriu on 05.12.2016.
 */
@Setter
@Getter
@Entity
@Table(name = "account")

public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "accountType", nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Column(name = "dateBirthday", nullable = false)
    private Date dateBirthday;


    @Column(name = "employment", nullable = false)
    @Enumerated(EnumType.STRING)
    private EmploymentType employment;

    @Column(name = "experience", nullable = false)
    private String experience;

    @Column(name = "languages", nullable = false)
    private String languages;

    @Column(name = "technologiest", nullable = false)
    private String technologiest;

    /**
     * pattern Builder
     */

    private Account() {
    }

    public static Builder Build() {
        return new Account().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setUsername(String name) {
            Account.this.setUsername(name);
            return this;
        }

        public Builder setPassword(String name) {
            Account.this.setPassword(name);
            return this;
        }

        public Builder setPosition(String name) {
            Account.this.setPosition(name);
            return this;
        }

        public Builder setAccountType(AccountType accountType) {
            Account.this.setAccountType(accountType);
            return this;
        }

        public Builder setDateBirthday(Date dateBirthday) {
            Account.this.setDateBirthday(dateBirthday);
            return this;
        }

        public Builder setEmployment(EmploymentType employmentType) {
            Account.this.setEmployment(employmentType);
            return this;
        }

        public Builder setExperience(String name) {
            Account.this.setExperience(name);
            return this;
        }

        public Builder setLanguages(String name) {
            Account.this.setLanguages(name);
            return this;
        }

        public Builder setTechnologiest(String name) {
            Account.this.setTechnologiest(name);
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }
}