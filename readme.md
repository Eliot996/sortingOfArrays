#Exercise w10.1
- Write a main program that makes an array of int. 
  - Fill the array with random integers.
  
- Make a int[] selectionSort(int[]) method 
  - Here you implement the selectionSort algorithm
- Measure how long time you selectionSort is using when sorting and array of N length, when N is 1000, 100.000 or 1.000.000 
  - Measure by calling System.nanoTime() before and after the method.
  - How does the runtime scale when N increases?
- Now measure the Java library Arrays.sort() performance
  - Send the same arrays to these methods where N is 1000,....
  - How does this scale?
  - Try reading the Java documentation, and see what sorting method is used.