/*
* generated by Xtext
*/
package edu.kit.ipd.sdq.vitruvius.framework.mir.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MIRAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("edu/kit/ipd/sdq/vitruvius/framework/mir/parser/antlr/internal/InternalMIR.tokens");
	}
}
