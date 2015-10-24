package companypractice.google;
/**
http://www.careercup.com/question?id=5645501623959552

Problem :
Design a class which can add and subtract integers up to 1000 digits. You can make the following assumptions 
No need to handle overflow or underflow (extra credit if you do) 
Copy constructor is available 
“+” and “­” are binary operators

Approach is 
1. Create a class "VeryLongINT"
2. it contains two fields 1. vector<int> 2. bool Sign (sign TRUE for +ve num, FALSE for -ve)
3. add operator methods to perform Addition and subtraction
4. while performing addition and subtraction operation we need to take care, "VeryLongINT" object sign.
5. E.g (obj1) + (-obj2), here I perform subtraction. 
(obj1) + (-obj2) = obj1 - obj2
6. (-obj1) -(obj2) = -(obj+obj2);

 */
public class VeryLongInt {

	public static void main(String[] args) {
		

	}

}
