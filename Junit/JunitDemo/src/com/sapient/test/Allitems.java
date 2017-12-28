package com.sapient.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({CalcTest.class,  LoanTest.class,PalindromeTest.class})
@IncludePackages("com.sapient.test")
@IncludeTags("prod")
public class Allitems {

}
