package com.hcl.phonechess;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.hcl.phonechess.factories.ChessPieceFactoryTest;
import com.hcl.phonechess.validators.UserInputValidatorTest;

@RunWith(Suite.class)
@SuiteClasses({ChessPieceFactoryTest.class, UserInputValidatorTest.class, AppTest.class})
public class AllTests {

}
