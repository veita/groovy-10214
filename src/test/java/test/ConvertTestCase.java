

package test;


import java.io.File;
import java.io.IOException;

import org.codehaus.groovy.control.CompilationFailedException;

import groovy.lang.GroovyShell;
import junit.framework.TestCase;


public final class ConvertTestCase extends TestCase
{
	public void test()
		throws CompilationFailedException, IOException
	{
		new GroovyShell().evaluate(new File("src/test/resources/testConvert.groovy"));
	}
}
