/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.huuthanh.mathutil.main;

import com.huuthanh.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Main {

//    public static void main(String[] args) {
//        // Test case #1: n = 0 | -!
//        int n = 0;
//        long expectedValue = 1;
//        long actualValue;
//        actualValue = MathUtility.getFactorial(n);
//        
//        // so sánh gi?a expectedValue và actualValue
//        System.out.println("0!: | Expected: " + expectedValue + 
//                               "| Actual: " + actualValue);
//       
//        //TEST CASE 2: 1! Ta hy v?ng hàm tr? v? 1
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1!: | Expected: " + expectedValue + 
//                               "| Actual: " + actualValue);
//        
//        //TEST CASE 3: 5! Ta hy v?ng hàm tr? v? 120
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5!: | Expected: " + expectedValue + 
//                               "| Actual: " + actualValue);
//        
//        //TEST CASE 4:
//        n = -1;
//        //expectedValue = "Hàm trung ra ngoai le";
//        System.out.println("Check getFactorial(-1) to see the exception");
//        actualValue = MathUtility.getFactorial(n);
//        // Hy vong se thay ngoai le xuat hien
//    }

    // this method is written directly in server to simulate
    // the work of another team member, he uploads code before me
    public static void SayHiFromServer() {
        
    }
    
    public static void main(String[] args) {
        // TEST CASE 1: 0! => 1
        int n = 0 ;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);
        String msg = "0!= | Expected: " + expectedResult + 
                        " Actual: " + actualResult;
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
