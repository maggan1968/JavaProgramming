package replits.if_Statements;

import java.util.Scanner;

public class HTTP_StatusCodes {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);

        System.out.println("Enter status code:");
        int status= scan.nextInt();

        if(status==200){
            System.out.println("OK");
        }
        if(status==201){
            System.out.println("Created");
        }
        if(status==202){
            System.out.println("Accepted");
        }
        if(status==301){
            System.out.println("Moved Permanently");
        }
        if(status==303){
            System.out.println("See Other");
        }
        if(status==304){
            System.out.println("Not Modified");
        }
        if(status==307){
            System.out.println("Temporary Redirect");
        }
        if(status==400){
            System.out.println("Bad Request");

        }
        if(status==401){
            System.out.println("Unauthorized");
        }
        if(status==403){
            System.out.println("Forbidden");
        }
        if(status==404){
            System.out.println("Not Found");
        }
        if(status==410){
            System.out.println("Gone");
        }
        if(status==500){
            System.out.println("Internal Server Error");
        }
        if(status==503){
            System.out.println("Service Unavailable");
        } else{

            System.out.println("Invalid status code!");

        }

    }
}
/*
HTTP is the protocol that governs communications between servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:

STATUS CODES

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
Given an int variable status write a switch statement to display the status code message. If an invalid status code is entered display Invalid status code!

Example:

Display message: "Enter status code:"

input: 200

Display message: "OK"
 */