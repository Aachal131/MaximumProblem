package com.pratic;

public class MaximumProblem<T extends Comparable<T>>{
    T x,y,z;
    public MaximumProblem(T x, T y, T z){
        this.x =x;
        this.y =y;
        this.z =z;
    }
    public  T maximum(){
        return  MaximumProblem.maximum(x,y,z);
    }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max =x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max =z;
        }
        printMax(x,y,z,max);
        return  max;
    }
    public static String testMaximum(String x,String y, String z){
        String max =x;
        if((y.compareTo(max)>0))
        {
            max=y;
        }
        if(z.compareTo(max)>0){
            max =z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public  static <T> void printMax(T x,T y, T z, T max){
        System.out.printf("max of %s, %s and %s is %s\n" ,x,y,z,max);
    }
        public static void main (String[] args){
        Integer xInt =3,yInt =4, zInt =5;
        Float xF1=6.6f, yF1 = 8.8f,zF1 =7.7F;
        String xStr ="Pear", yStr ="apple",zStr ="Orange";
        MaximumProblem.testMaximum(xStr,yStr,zStr);
        new MaximumProblem(xInt,yInt,zInt).maximum();
        new MaximumProblem(xF1,yF1,zF1).maximum();
        new MaximumProblem(xStr,yStr,zStr).maximum();
        }
    }


