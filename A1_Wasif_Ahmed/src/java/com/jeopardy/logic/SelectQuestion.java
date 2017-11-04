package com.jeopardy.logic;


import com.jeopardy.beans.Question;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wasif
 */
public class SelectQuestion extends Question {

    Question question = new Question();

    public Question loadQuestions(String qNum) {
        
        switch (qNum) {

            case "m1":
                question = new Question("Movies", "100", "Which baby wants to become a CEO and have his own Golden Potty",
                        "Baby Genius", "Boss Baby", "Rugrats", "Stewy", "Boss Baby");
                break;
            case "m2":
                question = new Question("Movies", "200", "Which super hero has a foul mouth",
                        "SpiderMan", "SuperMan", "Deadpool", "IronMan", "Deadpool");
                break;
            case "m3":
                question = new Question("Movies", "300",
                        "Live by the gun, Die by the gun, This statement may be applied to which actor",
                      "Vin Diesel", "Sylvestor Stallone", "Paul Walker", "Ice Cube", "Paul Walker");
                break;
            case "m4":
                question = new Question("Movies", "400", "Bruce Willis played a time travelling villain in what movie",
                        "The Sixth Sense", "12 Monkeys", "The Expandables", "Looper", "12 Monkeys");
                break;
            case "m5":
                question = new Question("Movies", "500", "In South Dakota, what is illegal to show in movies",
                        "Nudity", "Child Labour", "Police getting beaten", "Political Controversy", "Police getting beaten");
                break;
            case "t1":
                question = new Question("Technology", "100", "This is what differentiates Java from other languages",
                        "Garbage Collection", "Platform Independent", "Object Oriented", "Inheritence", "Platform Independent");
                break;
            case "t2":
                question = new Question("Technology", "200", "Which technology has revolutionized the FinTech industry",
                        "Bitcoin", "Blockchain", "Ripple", "Ethereum", "Blockchain");
                break;
            case "t3":
                question = new Question("Technology", "300", "In LA 300 drones lit up the sky to spell out W for this character",
                        "Wolverine", "Wonder Girl", "Wonder Woman", "White Canary", "Wonder Woman");
                break;
            case "t4":
                question = new Question("Technology", "400", "This phone was released on September 15th", "Iphone X", "Iphone 8",
                        "Samsung Note 8", "OnePlus 5", "Samsung Note 8");
                break;
            case "t5":
                question = new Question("Technology", "500", "This platform allows you to develop De-Centralized Applications and has an alliance of over 150 members including Microsoft",
                         "Ethereum", "Windows", "Linux", "Java", "Ethereum");
                break;
            case "s1":
                question = new Question("Sheridan", "100", "This is the mascot of Sheridan College", "Bruno the Bruin",
                        "The Shamster", "Max the Mutt", "Ollie the Owl", "Bruno the Bruin");
                break;
            case "s2":
                question = new Question("Sheridan", "200", "Sheridan College would seek to become a University by",
                        "2019", "2020", "2021", "2022", "2020");
                break;
            case "s3":
                question = new Question("Sheridan", "300", "The first program offered by Sheridan was in the field of",
                        "Information Technology", "Life Science", "Engineering", "Animations", "Animations");
                break;
            case "s4":
                question = new Question("Sheridan", "400", "Sheridan College was founded on this year", "1976", "1979", "1967", "1991", "1967");
                break;
            case "s5":
                question = new Question("Sheridan", "500", "The name of the current President of Sheridan college is",
                        "Jeff Zabudsky", "Mary Preece", "Jonathan Penava", "Hazel McCallion", "Mary Preece");
                break;
            case "a1":
                question = new Question("Automobile", "100", "James Bond's first car brand", "Mercedez", "Rolls Royce", "Lotus", "Aston Martin", "Aston Martin");
                break;
            case "a2":
                question = new Question("Automobile", "200", "This Toyota vehicle is expected to return in 2019", "Solara", "Previa", "Supra", "Tercel", "Supra");
                break;
            case "a3":
                question = new Question("Automobile", "300", "What does a diesel engine have?", "Sports mode", "Synthetic oil", "More gears", "Bigger Gaskets", "More gears");
                break;
            case "a4":
                question = new Question("Automobile", "400", "This vehicle is a mixture of station wagon and an SUV", "HR-V", "CRV", "Crossover", "Sedan", "Crossover");
                break;
            case "a5":
                question = new Question("Automobile", "500", "Who was the first car manufacturer", "Chrysler", "Benz", "Ford", "GMC", "Benz");
                break;
            case "w1":
                question = new Question("World", "100", "Capital city of Spain", "Barcelona", "Madrid", "Granada", "Seville", "Madrid");
                break;
            case "w2":
                question = new Question("World", "200", "World's longest river", "Amazon", "Yellow", "Congo", "Nile", "Amazon");
                break;
            case "w3":
                question = new Question("World", "300", "World's biggest island", "SriLanka", "Iceland", "Greenland", "Madagascar", "Greenland");
                break;
            case "w4":
                question = new Question("World", "400", "World's largest ocean", "Atlantic", "Arctic", "Indian", "Pacific", "Pacific");
                break;
            case "w5":
                question = new Question("World", "500", "The most dangerous country in the world", "Mexico", "Syria", "North Korea", "Thailand", "Syria");
                break;
            default: System.out.println("No params selected");
        }

        return question;

    }
    
 
}
