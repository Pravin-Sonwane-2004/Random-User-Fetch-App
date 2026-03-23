package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class service {

    // Autowiring fields is discouraged; constructor injection is recommended.
    // Assuming 'entity' is the name of your Entity class.
    // The field 'e' is not used in the original method, so it can be removed
    // or used properly to create an entity instance.

    @Autowired
    static UserRepository r;
    // Recommended: Constructor injection
    @Autowired
    public service(UserRepository r) {
        this.r = r;
    }

    @Transactional // Ensures the operation runs within a transaction
    public static User saveUser(String userName) { // Changed method name and added parameter
        // 1. Create a new Entity object with the provided data.
        User newUser = new User();
        // Assuming your Entity class has a setter for the name field.
        newUser.setName(userName); // Set the name property of the entity

        // 2. Save the entity using the repository's save() method.
        // It's a best practice to use the returned instance of save()
        // as it is the managed entity instance.
        return r.save(newUser);
    }
}
