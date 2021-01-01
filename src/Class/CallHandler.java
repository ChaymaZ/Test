package Class;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CallHandler {
	static final int LEVELS = 3; // 3 niv des emplyés 

    static final int NUM_FRESHERS = 5; 

    ArrayList<Employee>[] nivempl = new ArrayList[LEVELS];

    Queue<Call>[] FileAttente = new LinkedList[LEVELS];

 

    public CallHandler() {

        // constructor

    }

 
////renvoie un employé dispo à accepter l'appel.
    Employee getCallHandler(Call call) {

        for (int niv = call.rang; niv < LEVELS - 1; niv++) {

            ArrayList<Employee> emplniv = nivempl[niv];

            for (Employee emp : emplniv) {

                if (emp.free) {

                    return emp;

                }

            }

        }

        return null;

    }

 
       //prendre l'un des 3 employés après essayez de recevoir l'appel si le retour de 3 est nul , placez l'appel dans la file d'attente
   
    void dispatchCall(Call call) {

        Employee emp = getCallHandler(call);
        // achemine l'appel vers un employé disponible ou ajoute à une file d'attente

        if (emp != null) {

            emp.RevCall(call);

        } else {

            // placer l'appel  dans la file d'attente

        	FileAttente[call.rang].add(call);

        }

    }

 
   
    void getNextCall(Employee e) {

       

    }

}

 

