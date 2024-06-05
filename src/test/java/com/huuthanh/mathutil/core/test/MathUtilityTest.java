/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.huuthanh.mathutil.core.test;

import com.huuthanh.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
// quy u?c dat ten package cua Java


public class MathUtilityTest {
    
    
    // o day chua cac lenh cac ham dung de di test ham chinh o ben code chinh
    // o day thu muc source phia tren coi ham chay on ko
    // o day ta lam cac ham ung voi cac tes case de test code chinh o ben
    //MathUltility. vi du .getFactorial()
    
    // TEST CASE: DO DATA DUA VAO HAM, APP DE VERIFY HAM, APP CO XU LI
    // DUNG HAY KO, NO DI KEM THEO CACH XAI HAM, TRINH TU XAI APP + EXPECTED
    // VALUE + STATUS PASSED HAY FAILED
    
    // TEST CASE 1: CHECK GETFACTORIAL() WITH N = 0, 0!
     @Test
     public void testFactorialGivenRightArg0RuturnsWell() {
         int n = 0;
         long expectedValue = 1;
         long actualValue; //
         //neu expected == actual, ham ngon voi case nay
         
         actualValue = MathUtility.getFactorial(n);
         
         Assertions.assertEquals(expectedValue, actualValue);
         // cach cu la phai sout tung cai 1, va dung mat de nhin dung sai
     }
     
     // TEST CASE #2: CHECK GETFACTORIAL WITH N = 1, EXPECTED => 1! = 1
     @Test
     public void testFactorialGivenRightArg1ReturnsWell() {
         int n = 1;
         long expectedValue = 1;
         long actualValue; //
         //neu expected == actual, ham ngon voi case nay
         
         actualValue = MathUtility.getFactorial(n);
         
         Assertions.assertEquals(expectedValue, actualValue);
         // cach cu la phai sout tung cai 1, va dung mat de nhin dung sai
     }
     
     // TEST CASE #3: CHECK GETFACTORIAL WITH N = 2, EXPECTED => 2! = 2
     // TEST CASE #3: CHECK GETFACTORIAL WITH N = 3, EXPECTED => 3! = 6
     // TEST CASE #3: CHECK GETFACTORIAL WITH N = 5, EXPECTED => 5! = 120
     @Test
     public void testFactorialGivenRightArg235ReturnsWell() {
         int n = 2;         
         long expectedValue = 2;
         long actualValue; //
         //neu expected == actual, ham ngon voi case nay
         
         actualValue = MathUtility.getFactorial(2);
         
         Assertions.assertEquals(expectedValue, actualValue);  // 2! = 2
         
         
         Assertions.assertEquals(6, MathUtility.getFactorial(3));  // 3! = 6???
         
         
         Assertions.assertEquals(120, MathUtility.getFactorial(5));  // 5! = 120???
         // cach cu la phai sout tung cai 1, va dung mat de nhin dung sai
     }
     
     @Test
     public void testFactorialGivenWrongArg_1ThrowsException() {
         // Input n < 0, n = -1
         // Expected result: Illegal Argument Exception
         // nho quy uoc: mau xanh tra ve nhu ki vong, mau bo actual != ki vong
         // Ngoai le ko la value, ta ko khai bao bien de bang ngoai le, ko assertEquals(value value)
         Assertions.assertThrows(IllegalArgumentException.class, 
                 () -> {MathUtility.getFactorial(-1);});
     }
}

// PHAN KIEN THUC BO SUNG VAO CV
//TDD - TEST DRIVEN DEVELOPMENT
//LA KI THUAT VIET CODE CUA DAN DEV DI KEM VOI VIET CAC TEST CASE
// DE KIEM THU NGAY NHUNG CODE VUA VIET
// TUC LA CODE MOI HAM, LUON DI KEM CODE KIEM THU
//KET QUA KIEM THU HIEN THI THEO 2 MAU XANH - CODE NGON, PASS CAC TEST CASE
// MAU DO, CODE DA KO PASS TEST CASE
// VIET NAY CU LIEN TUC NHU VAY, VIET CODE, VIET TEST CASE, RUN TEST
// CASE DE XEM XANH DO, KI THUAT NAY GOI LA TDD

// MOI NGON NGU LAP TRINH DEU HO TRO CAC BO THU VIEN, FRAMEWORK
//TEST CODE 2 MAU XANH DO, GOI LA UNIT TESTING FRAME WORK
//MOI NGON NGU DEU HO TRO TDD, VAN DE LA DEV TEAM CO XAI HAY KO

// DE BAI THUYET TRINH NHOM
// NHOM HAY CHON 1 UNIT TESTING FRAMEWORK DE DEMO
// VAO GOOGLE GO UNIT TESTING FRAMEWORK FOR <NNLT>
// C#: NUNIT, XUNIT, MS TEST
//JAVA: TESTING...
//JS: MOCHA, JASMINE


// DONG THU 2 TRONG CV
// DDT - DATA DRIVEN TESTING | TU TUONG DUONG PARAMETERIZED TESTING - VIET TESTCASE THEO STYLE THAM SO HOA (DUNG NHAM VOI TDD - TEST DRIVEN DEVELOPMENT)
// DDT LA PHAN MO RONG THEM KHI VIET UNIT TEST, KI THUAT NANG CAO KHI VIET CAC TEST CASE, NO CO BA CON VOI TDD

// DDT - PARAMETERIZED TESTING LA KI THUAT VIET CAC TEST CASE MA TA TACH RIENG PHAN DATA RA KHOI CAC CAU LENH ASSERT()
// CHO DE QUAN LI TINH THIEU DU CUA CAC TEST CASE
// DE THEO DOI CAC PHAN CODE LIEN QUAN DEN TEST HAM
// VI CAU LENH SO SANH EXPECTED VS ACTUAL TRO NEN GON NHO HON