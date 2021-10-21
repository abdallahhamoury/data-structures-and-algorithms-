<<<<<<< HEAD
# Reverse an Array

Write a function that returns numbers in reverse

## Whiteboard Process

![Reverse an Array](https://github.com/abdallahhamoury/data-structures-and-algorithms-/blob/main/code1/codec1.jpg?raw=true)


## Approach & Efficiency

- I created the ِArray
- I defined a variable to work on a lube and rewind numbers as required
- I added a new element to replace the old one
- return new array



## code

public class revers(int[] numbe ){
  int[] arr = new int[numbe.length];
  int rvD = 0;
  for (int i = arr.length - 1; i >= 0; i--){
    arr[rvD++] = numbe[i];
  }
  return arr;
  
}
=======
# Reverse an Array

Write a function that returns numbers in reverse

## Whiteboard Process

![Reverse an Array](./codec1.jpg)


## Approach & Efficiency

- I created the ِArray
- I defined a variable to work on a lube and rewind numbers as required
- I added a new element to replace the old one
- return new array



## code

public static int[] revers(int[] array ){
int[] newArray= new int[array.length];
int count= 0;
for (int i = array.length - 1; i >= 0; i--){
newArray[count++] = array[i];
}
return newArray;

}
>>>>>>> 45513a0d66f94612e45cd9929724d30e247acb9a
