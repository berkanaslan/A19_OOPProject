package com.berkanaslan.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /* Old time

        User myUser = new User();
        myUser.name = "Berkan";
        myUser.job = "Student";

        User newUser = new User();
        newUser.name = "Busra";
        newUser.job  = "Programmer"; */

        User myUser = new User("Berkan", "Student");
        System.out.println(myUser.name);

        //Abstract
        System.out.println(myUser.information());

        // Encapsulation
        Musician james = new Musician("James", "Guitar", 50);
        james.setAge(75, "Berkan"); //Setter feature from Musicians class
        System.out.println(james.getAge()); //Getter feature from Musicians class

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars", "Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getName());

        //Polymorphism

        //Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5, 4));
        System.out.println(mathematics.sum(5,4,3));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.Sing();

        Dog barley = new Dog();
        barley.Test();
        barley.Sing();





    }
}
