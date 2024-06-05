/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huuthanh.mathutil.core;

/**
 *
 * @author Administrator
 */
public class MathUtility {
        // Ta viê´t nhu~ng ha`m toa´n ho?c cung câ´p cho bên ngoa`i su?dungj
    // giô´ng nhu thu viê?n c?a JDK
    
    //hàm tính giai th?a
    // n 0 ... 20 do 21! tràn ki?u long, ko có âm giai th?a
    // 0! = 1
    public static long getFactorial(int n){
        long product = 1; //Bi?n con heo dát, bi?n nhân d?n, ti?p chiêu
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n, n must be between 0...20");
        
        if (n == 0) 
            return 1;
        
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
