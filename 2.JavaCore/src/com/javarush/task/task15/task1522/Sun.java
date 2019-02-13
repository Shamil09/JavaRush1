package com.javarush.task.task15.task1522;

//public class LazyInitializedSingleton {
//    private static LazyInitializedSingleton instance;
//        private LazyInitializedSingleton(){}
//        public static LazyInitializedSingleton getInstance(){ // #3
//        if(instance == null){		//если объект еще не создан
//            instance = new LazyInitializedSingleton();	//создать новый объект
//        }
//        return instance;		// вернуть ранее созданный объект
//    }
//}
class Sun implements Planet{
    private static Sun instance;
    private Sun() {}
    public static Sun getInstance(){
        if (instance==null) instance=new Sun();
        return instance;
    }
}
