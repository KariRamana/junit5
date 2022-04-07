package com.zensar.Junit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeCheckTest {
	@ParameterizedTest
	@ValueSource(strings = {"MADAM","121"})
  public void testPalindrome(String str) {
	  PalindromeCheck pc=new PalindromeCheck();
	  boolean actualResult=pc.isPalindrome(str);
	  boolean expectedResult=true;
	  assertEquals(expectedResult,actualResult);
  }
}
