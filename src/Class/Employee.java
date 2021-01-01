package Class;

public class Employee {
	 CallHandler callHandler;
        int id;
        String nom ;
        String prenom;
       
	    int rang;

     ///vérifier si l'employé dispo ou nn 
	    boolean free;

	 

	    Employee(int rang) {

	        this.rang = rang;

	    }

	 

	    void RevCall(Call call) {


	    }

	 

	    void CallHandled(Call call) {


	    }

	 
       /////remonter l'appel
	    void CannotHandle(Call call) { 

	        call.rang = rang + 1; 
	        
	        //renvoie de l'appel
	       

	        callHandler.dispatchCall(call);

	        free = true;
            
	        ////voir s'il y a des appels en attente
	        callHandler.getNextCall(this); 

	    }

	}

	 


	 
	 

