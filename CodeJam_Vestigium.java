package com.codeinshort.java;

import java.util.*;
//https://codingcompetitions.withgoogle.com/codejam/round/000000000019fd27/000000000020993c
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int len = sc.nextInt();
        int[][] a = new int[len][len];
        int diagSum = 0;
        int rows = 0;
        int cols = 0;
        Set<Integer> rSet = new HashSet<>();
        Set<Integer> cSet = new HashSet<>();

        for(int t=1;t<=tests;t++){
            for(int i=0;i<len;i++){
                for(int j=0;j<len;j++){
                    a[i][j] = sc.nextInt();
                }
            }

            for(int i=0;i<len;i++){
                boolean rFlag = false;
                boolean cFlag = false;
                for(int j=0;j<len;j++){
                    if(i==j){
                        diagSum += a[i][j];
                    }
                    if(rSet.contains(a[i][j])){
                        rFlag = true;
                    }
                    if(cSet.contains(a[j][i])){
                        cFlag = true;
                    }
                    rSet.add(a[i][j]);
                    cSet.add(a[j][i]);
                }
                rSet.clear();
                cSet.clear();
                if(rFlag){
                    rows++;
                }
                if(cFlag){
                    cols++;
                }
            }
            System.out.println("Case #"+t+":"+" "+diagSum+" "+rows+" "+cols);
            rows = 0;
            cols = 0;
        }

    }
}
