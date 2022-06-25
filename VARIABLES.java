package com.bridgelabz.basics;

// JVM starts executing the code from main method.
// Data types : primitive and non-primitive.
// Primitive data types(8) : byte,short,int,long,float,double,char,boolean
// Non-Primitives : Arrays,Class,Interface.

public class Variables {

    // static variables are class-level variables
    // static variables will get the memory when class loading happens.
    // It is not mandatory to initialize static variables
    // Static variable will be shared throughout the class.
    static int staticVar1 = 10;  // default value taken if not initialized

    // instance variables are object-level variables
    // instance variables will get the memory when object gets created.
    // It is not mandatory to initialize instance variables
    // Each object will have a copy of instance variables.
    int instanceVar1 = 100;  // default value taken if not initialized
    String stringInstanceVar = "ABC";

    // default constructor
    // if i am not creating this default constructor, JVM will create it.
    Variables(){

    }

    // static method = > class-level method
    static void method1() {
        // x is a Local varaible of method1
        Variables var1 = new Variables();
        var1.instanceVar1 = 20;
        var1.stringInstanceVar = "MNO";
        System.out.println(var1.instanceVar1);
        System.out.println(var1.stringInstanceVar);

        int x = 0;
        System.out.println(x);
        System.out.println("method1 static var: "+staticVar1);
    }

    // non-static method = > Object-level method

    void method4(){

    }
    void method3(){
        System.out.println(instanceVar1);
        System.out.println(stringInstanceVar);
        method4();
    }

    static void method2(int x, int y, Variables variables) {
        // x and y are also Local varaibles of method2
        staticVar1 = 47;
        System.out.println(x);
        System.out.println(y);
        System.out.println("method2 static var: "+staticVar1);
        System.out.println(variables.instanceVar1);
        System.out.println(variables.stringInstanceVar);
    }


    public static void main(String[] args) {

        // Primitives
        // size increases of data types as we move ahead
        // byte range => -128 to 127
        byte b = 1;    // 0  // 1 byte
        short s = 2;  // 0   // 2 bytes
        int i = 10;   // 0  // 4 bytes
        long l = 34; // 0   // 8 bytes
        float f = 90.7F;  // 0.0F  // 4 bytes
        double d = 100.5;  // 0.0  // 8 bytes
        char c = '4';      //  \u0000 // 2 bytes
        boolean b1 = true; // false  // 1 bit
        System.out.println(b1);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);

        // Non-Primitives
        // default values of non-primitives is null
        String str = new String("ABC");
        System.out.println(str);
        // Arrays are non-primitives
        int[] arr = new int[10];
        arr[1] = 300;
        System.out.println(arr[1]);
        // Sequential statements
        System.out.println("Variables");
        System.out.println("Types of variables : local, instance, static");

        // Local variables
        // Variable which are local to a method or a block of code
        // the scope of that variable will be within that method or block
        // Local variable must be initialized.
        int z = 12;
        System.out.println(z);
        method1();
//        method2(1, 8);

        // selection statements
        if (z == 10) {
            int var1 = 30;
//            method1();
            System.out.println(var1);
        } else {
            int var2 = 40;
            System.out.println(var2);
        }


        if (z == 11) {
            System.out.println(z);
        } else if (i == 11) {
            System.out.println(i);
        } else {
            System.out.println("else");
        }

        // repatitive statements
        // Loops => for, while , do-while
        int n = 0;
        for (int j = 0; j < 10 && n<5 ; j++,n++) {
//            int x = 0;
//            System.out.println(x);
            System.out.println(j);
        }

        int k = 0;
        int m = 0;
        while (k < 10 && m<5) {
            //int x = 0;
            //System.out.println(x);
            System.out.println(k);
            m++;
            k++;
        }
//        System.out.println(k);

        int g = 0;
        int h = 0;
        do{
            System.out.println(g);
            g++;
            h++;
        }while(g<10 && h<5);

        System.out.println("main :"+staticVar1);
        method1();

        // left part is object reference which is pointing to that object(memory location)
        // right part is object creation (new keyword with constructor call)
        Variables variables = new Variables();  // instanceVar1 ,stringInstanceVar , method3() , method4()
        variables.stringInstanceVar = "Bridgelabz";
        variables.instanceVar1 = 400;
        System.out.println(variables.instanceVar1);
        System.out.println(variables.stringInstanceVar);
        variables.method3();
        method2(1, 8,variables);

    }
}

