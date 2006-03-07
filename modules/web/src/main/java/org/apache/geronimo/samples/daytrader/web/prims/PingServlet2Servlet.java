/**
 *
 * Copyright 2005 The Apache Software Foundation or its licensors, as applicable 
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.geronimo.samples.daytrader.web.prims;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.geronimo.samples.daytrader.util.*;


/**
 *
 * PingServlet2Servlet tests servlet to servlet request dispatching. Servlet 1,
 * the controller, creates a new JavaBean object forwards the servlet request with
 * the JavaBean added to Servlet 2. Servlet 2 obtains access to the JavaBean through
 * the Servlet request object and provides the dynamic HTML output based on the JavaBean
 * data.
 * PingServlet2Servlet is the initial servlet that sends a request to {@link PingServlet2ServletRcv}
 *
 */
public class PingServlet2Servlet extends HttpServlet {
	private static int hitCount = 0;

/**
 * forwards post requests to the doGet method
 * Creation date: (11/6/2000 10:52:39 AM)
 * @param res javax.servlet.http.HttpServletRequest
 * @param res2 javax.servlet.http.HttpServletResponse
 */
public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
	doGet(req, res);
}
/**
* this is the main method of the servlet that will service all get requests.
* @param request HttpServletRequest
* @param responce HttpServletResponce
**/
public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
	PingBean ab;
	try
	{
		ab = new PingBean();
		hitCount++;
		ab.setMsg("Hit Count: " + hitCount);
		req.setAttribute("ab", ab);
		
		getServletConfig().getServletContext().getRequestDispatcher("/servlet/PingServlet2ServletRcv").forward(req, res);
	}
	catch (Exception ex)
	{
		Log.error(
			ex,	"PingServlet2Servlet.doGet(...): general exception"); 
		res.sendError(500, "PingServlet2Servlet.doGet(...): general exception" + ex.toString()); 

	}
}   
}