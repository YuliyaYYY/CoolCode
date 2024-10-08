package day08_Ternaries_SwitchStatement;

import java.sql.SQLOutput;

public class HTTP_StatusCode {
    public static void main(String[] args) {

        int StatusCode = 303;
           switch (StatusCode){
               case 200:
                   System.out.println("Ok");
                   break;
               case 201:
                   System.out.println("Created");
                   break;
               case 202:
                   System.out.println("Accepted");
                   break;
               case 301:
                   System.out.println("Moved Permanently");
                   break;
               case 303:
                   System.out.println("See other");
                   break;


           }
    }
}
/*
HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:
            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable
         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200
                    output:
                        ok
       	Note: MUST use switch statement
 */