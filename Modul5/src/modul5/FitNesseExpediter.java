/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

import com.sun.net.httpserver.Request;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Rolan Firmansyah
 */
public class FitNesseExpediter implements ResponseSender {
    private     Socket          socket;
    private     InputStream     input;
    private     OutputStream    output;
    private     Request         request;
    private     Response        response;
    private     FitNesseContext context;
    protected   long            requestParsingTimeLimit;
    private     long            requestProgress;
    private     long            requestParsingDeadline;
    private     boolean         hasError;
    ...
}
