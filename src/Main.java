import java.util.*;

public class Main {

	//public static final int QUEUE_LENGTH = 5; 
	
	public static void main(String[] args) {
		
////		пример естественного добавления элементов в приоритетную очередь
//        Queue<Integer> integerPriorityQueue = new PriorityQueue<>(QUEUE_LENGTH);
//        Random rand = new Random();
//        for(int i=0; i<QUEUE_LENGTH; i++){
//            integerPriorityQueue.add(new Integer(rand.nextInt(100)));
//        }
//        for(int i=0;i<QUEUE_LENGTH;i++){
//            Integer in = integerPriorityQueue.poll();
//            System.out.println("Processing Integer:"+in);
//        }
//         
        //Пример PriorityQueue с компаратором
        Queue<Payer> payerPriorityQueue = new PriorityQueue<>(idComparator);
        
        addDataToQueue(payerPriorityQueue);
         
        pollDataFromQueue(payerPriorityQueue);
         
    }
     
    //Анонимный класс компаратора
    public static Comparator<Payer> idComparator = new Comparator<Payer>(){
         
        @Override
        public int compare(Payer p1, Payer p2) {
            return (int) (p1.getPriority() - p2.getPriority());
        }
    };
 
    // служебный метод добавления элементов в очередь
    private static void addDataToQueue(Queue<Payer> payerPriorityQueue) {
//        Random rand = new Random();
//        for(int i=0; i<QUEUE_LENGTH; i++){
//            int id = rand.nextInt(100);
//            payerPriorityQueue.add(new Payer(id, "name"+id));
//        }
    	payerPriorityQueue.add(new Payer(12, "Мужик"));
        payerPriorityQueue.add(new Payer(9, "Блондінка"));
        payerPriorityQueue.add(new Payer(5, "Бабка"));
        payerPriorityQueue.add(new Payer(3, "Дедка"));
        payerPriorityQueue.add(new Payer(33, "Жучка"));
        payerPriorityQueue.add(new Payer(99, "Кицька"));
        payerPriorityQueue.add(new Payer(21, "Внучка"));
        payerPriorityQueue.add(new Payer(911, "Мишка"));
        payerPriorityQueue.add(new Payer(1, "Репка"));
    }
     
    //служебный метод для обработки данных очереди
    private static void pollDataFromQueue(Queue<Payer> payerPriorityQueue) {
        while(true){
            Payer payer = payerPriorityQueue.poll();
            if(payer == null) break;
            System.out.println(payer.getPriority() + " Обработка клиента " + payer.getName());
        }
		
        public static int randInt() {
    		Random rand = new Random();
    		int randomNum = rand.nextInt(8);
    		return randomNum;
    	}	
		
//		// Creating empty priority queue 
//		PriorityQueue<Payer> pQueue = new PriorityQueue<Payer>(); 
//		
//		
//		
//		
//        // Adding items to the pQueue using add() 
//        pQueue.add("C"); 
//        pQueue.add("C++"); 
//        pQueue.add("Java"); 
//        pQueue.add("Python"); 
//  
//        // Printing the most priority element 
//        System.out.println("Head value using peek function:"
//                           + pQueue.peek()); 
//  
//        // Printing all elements 
//        System.out.println("The queue elements:"); 
//        Iterator itr = pQueue.iterator(); 
//        while (itr.hasNext()) 
//            System.out.println(itr.next()); 
//  
//        // Removing the top priority element (or head) and 
//        // printing the modified pQueue using poll() 
//        pQueue.poll(); 
//        System.out.println("After removing an element"
//                           + "with poll function:"); 
//        Iterator<String> itr2 = pQueue.iterator(); 
//        while (itr2.hasNext()) 
//            System.out.println(itr2.next()); 
//  
//        // Removing Java using remove() 
//        pQueue.remove("Java"); 
//        System.out.println("after removing Java with"
//                           + " remove function:"); 
//        Iterator<String> itr3 = pQueue.iterator(); 
//        while (itr3.hasNext()) 
//            System.out.println(itr3.next()); 
//        
//        // Check if an element is present using contains() 
//        boolean b = pQueue.contains("C"); 
//        System.out.println("Priority queue contains C "
//                           + "or not?: " + b); 
//  
//        // Getting objects from the queue using toArray() 
//        // in an array and print the array 
//        Object[] arr = pQueue.toArray(); 
//        System.out.println("Value in array: "); 
//        for (int i = 0; i < arr.length; i++) 
//            System.out.println("Value: " + arr[i].toString()); 
//    
	}

}
