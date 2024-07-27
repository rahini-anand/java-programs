package iitm.programming;
//
////import java.util.*;
////
////interface Iterator{
////    public boolean has_next();
////    public Object get_next();
////}
////
////class Sequence{
////    private final int maxLimit = 80;
////    private SeqIterator _iter = null;
////    int[] iArr; 
////    int size;
//////implement the parameterized constructor to initialize size
////    
////    public Sequence(int size) {
////        
////        this.size = size;
////        this.iArr = new int[size];
////        _iter= (SeqIterator)get_Iterator();
////    }
////
//////implement addTo(elem) to add an int elem to the sequence 
////    public void addTo(int elem) {
////    	//System.out.println("size"+size);
////    	if(_iter.has_next()) {
////    		_iter.indx++;
////    		iArr[_iter.indx] = elem;
////    	}
////        
////        
////    	
////    
////    	 
////    }
////    
////    public void display() {
////    	_iter.indx = 0;
////    	while(_iter.has_next()) {
////    		System.out.println(iArr[_iter.indx++]);
////    	}
////        
////    }
//////implement get_Iterator() to return Iterator object
////    
////    public Iterator get_Iterator() {
////        if (_iter == null) {
////            _iter = new SeqIterator();
////        }
////        return _iter;
////    }
//// 
////    private class SeqIterator implements Iterator{
////        int indx;
////        public SeqIterator(){
////            indx = -1;
////        }
////        //implement has_next()
////        @Override
////        public boolean has_next() {
////            return indx < size;
////        }
////        //implement get_next()
////        @Override
////        public Object get_next() {
////            if (!has_next()) {
////                throw new NoSuchElementException("No more elements in the sequence");
////            }
////            return iArr[++indx];
////        }
////    
////    }
////}
////    
////
////class Assignments{
////    public static void main(String[] args) {
////        Sequence sObj = new Sequence(5);
////        Scanner sc = new Scanner(System.in); 
////        for(int i = 0; i < 5; i++) {
////            sObj.addTo(sc.nextInt());
////        }
////        sObj.display();
////       
////        Iterator i = sObj.get_Iterator();
////        while(i.has_next())
////            System.out.print(i.get_next() + ", ");
////    }
////}
//
//import java.util.*;
//
//interface Iterator{
//    public boolean has_next();
//    public Object get_next();
//}
//
//class Sequence{
//    private final int maxLimit = 80;
//    private SeqIterator _iter = null;
//    int[] iArr; 
//    int size;
////implement the parameterized constructor to initialize size
//public Sequence(int size) {
//       
//        this.size = size;
//        this.iArr = new int[size];
//        _iter= (SeqIterator)get_Iterator();
//       
//    }
//
////implement addTo(elem) to add an int elem to the sequence 
//
//public void addTo(int elem) {
//        if(_iter.has_next()) {
//    		_iter.indx++;
//    		iArr[_iter.indx] = elem;
//    	}else {
//    		_iter.indx = 0;
//    	}
//    }
////implement get_Iterator() to return Iterator object
// public Iterator get_Iterator() {
//        if (_iter == null) {
//            _iter = new SeqIterator();
//        }
//        return _iter;
//    }
//    
// public void display() {
// 	_iter.indx = 0;
// 	while(_iter.has_next()) {
// 		System.out.println(iArr[_iter.indx++]);
// 	}
//     
// }
//    private class SeqIterator implements Iterator{
//        int indx;
//        public SeqIterator(){
//            indx = -1;
//        }
//        //implement has_next()
//
//        
//       public boolean has_next() {
//            return indx < size ;
//        }
//
//        //implement get_next()
//       public Object get_next() {
//           
//            return iArr[++indx];
//        }
//}
//}
//
//class Assignments{
//    public static void main(String[] args) {
//        Sequence sObj = new Sequence(5);
//        Scanner sc = new Scanner(System.in); 
//        for(int i = 0; i < 5; i++) {
//            sObj.addTo(sc.nextInt());
//        }
//        sObj.display();
//        Iterator i = sObj.get_Iterator();
//        while(i.has_next())
//            System.out.print(i.get_next() + ", ");
//    }
//}

import java.util.*;

interface Iterator {
    public boolean has_next();
    public Object get_next();
}

class Sequence {
    private final int maxLimit = 80;
    private SeqIterator _iter = null;
    int[] iArr; 
    int size;
    int currentIndex;

    // Implement the parameterized constructor to initialize size
    public Sequence(int size) {
        if (size > maxLimit) {
            throw new IllegalArgumentException("Size exceeds max limit of " + maxLimit);
        }
        this.size = size;
        this.iArr = new int[size];
        this.currentIndex = 0;
    }

    // Implement addTo(elem) to add an int elem to the sequence
    public void addTo(int elem) {
        if (currentIndex >= size) {
            throw new ArrayIndexOutOfBoundsException("Sequence is full");
        }
        iArr[currentIndex++] = elem;
    }

    // Implement get_Iterator() to return Iterator object
    public Iterator get_Iterator() {
        if (_iter == null) {
            _iter = new SeqIterator();
        }
        return _iter;
    }

    private class SeqIterator implements Iterator {
        int indx;

        public SeqIterator() {
            indx = -1;
        }

        // Implement has_next()
        @Override
        public boolean has_next() {
            return indx < currentIndex - 1;
        }

        // Implement get_next()
        @Override
        public Object get_next() {
            if (!has_next()) {
                throw new NoSuchElementException("No more elements in the sequence");
            }
            return iArr[++indx];
        }
    }
}
    class Assignments{
    public static void main(String[] args) {
        Sequence sObj = new Sequence(5);
        Scanner sc = new Scanner(System.in); 
        for (int i = 0; i < 5; i++) {
            sObj.addTo(sc.nextInt());
        }
        Iterator i = sObj.get_Iterator();
        while (i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}

