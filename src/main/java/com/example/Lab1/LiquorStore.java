package com.example.Lab1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiquorStore {

    public boolean isAllowedToEnterLiquorStore(int age, boolean inCompanyOfAParent, boolean hasADog, boolean isBlind) {
        if(!isBlind && hasADog){
            return false;
        }
        return inCompanyOfAParent || age >= 20;
    }
}
