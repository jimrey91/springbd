package com.reyes.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reyes.beans.Equipo;
import com.reyes.beans.Jugador;
import com.reyes.beans.Marca;
import com.reyes.service.ServiceJugador;
import com.reyes.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/reyes/xml/beans.xml");
    	
//    	ServiceMarca service = (ServiceMarca)appContext.getBean("serviceMarcaImpl");
    	ServiceJugador sj = (ServiceJugador)appContext.getBean("serviceJugadorImpl");
    	
    	//Marca mar = (Marca) appContext.getBean("marca1");
    	//Equipo eq = (Equipo)appContext.getBean("equipo1");
    	Jugador jug = (Jugador) appContext.getBean("jugador1");
     	
    	try {
			sj.registrar(jug);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    }
}
