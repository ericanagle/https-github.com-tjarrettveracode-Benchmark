package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest09864")
public class BenchmarkTest09864 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = request.getParameter("foo");

		String bar = new Test().doSomething(param);
		
		Object[] obj = { "a", bar };
		
		response.getWriter().format("notfoo",obj);
	}  // end doPost

    private class Test {

        public String doSomething(String param) throws ServletException, IOException {

		// Chain a bunch of propagators in sequence
		String a85366 = param; //assign
		StringBuilder b85366 = new StringBuilder(a85366);  // stick in stringbuilder
		b85366.append(" SafeStuff"); // append some safe content
		b85366.replace(b85366.length()-"Chars".length(),b85366.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map85366 = new java.util.HashMap<String,Object>();
		map85366.put("key85366", b85366.toString()); // put in a collection
		String c85366 = (String)map85366.get("key85366"); // get it back out
		String d85366 = c85366.substring(0,c85366.length()-1); // extract most of it
		String e85366 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d85366.getBytes() ) )); // B64 encode and decode it
		String f85366 = e85366.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String g85366 = "barbarians_at_the_gate";  // This is static so this whole flow is 'safe'
		String bar = thing.doSomething(g85366); // reflection

            return bar;
        }
    } // end innerclass Test

} // end DataflowThruInnerClass