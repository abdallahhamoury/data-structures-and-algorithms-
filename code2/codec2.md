# Insert to Middle of an Array
Write a function called i which takes in an array and a value to be added. , return an array with the new value added at the middle index

## Whiteboard Process
![Image of Yaktocat](https://github.com/abdallahhamoury/data-structures-and-algorithms-/blob/main/code2/codec2.png?raw=true)


## Approach & Efficiency

Declare new variable to hold entered array length
create new array with length equal to entered array's length+1
define new variable for index position where we want to add entered value equals to (entered array's length/2) if even and
create a for loop with number of iterations equal to new array's length
add the entered value at index position, then continue adding the rest of the elements
return new array

---------------------------------------------------------------------------------------------------------------------------------

public int[] center(int[] inputs, int value) {
  int srdDin = 0;
  int[] newArr = new int [inputs.length+1];
  if(inputs%2 == 0) {
    srdDin = inputs.length/2;
  }else {
    srdDin = (inputs.length/1)2;
  }
  for (int i=0; i<inputs; i++) {
    if (i=srdDin){
      newArr[] = value;
    }else if(i<srdDin){
      newArr[i]=inputs;
    }else{
      newArr[i]= inputs[i-1];
    }
    return newArr;
  }
}
