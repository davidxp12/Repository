package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Login;

public abstract class Command {
	
	public abstract String executar(HttpServletRequest request,	HttpServletResponse response) throws Exception;	
	
}
