# RollerCoaster
A roller coaster is being maintained by a group who take shifts to handle the crowds. As per the rules they came up with, they only allow customers who are taller than them to ride. Given the heights and the shift timing of all the members of the group and the heights of customers entering the roller coaster at that time, check whether that customer will be allowed or not.

Input:
1. Given number 'n' specifying the numberof members
2. 'n' number of values in the following order
	1. Height
	2. Shift timing starting hour (inclusive)
	3. Shift timing ending hour (inclusive)
3. Given 'n1' specifying the number of customers
4. 'n1' number of height and timing of each customer, provide output as 'yes' or 'no' to indicate if he will be allowed to ride or not.

Note: If no member fails on the given customer timing. that customer will be allowed to ride.

		Sample Input 1:
		3
		10 1 5
		12 6 8
		8 9 10
		3
		11 3
		10 12
		5 8
		Sample Output 1:
		Yes
		Yes
		No

		Sample Input 2:
		3
		10 1 5
		12 6 8
		8 9 10
		3
		15 7
		5 12
		Sample Output 2:
		Yes
		Yes

Explanation:
1. For (i)
Yes - as the member at '3' is of height '10', he would allow a customer with height '11'
Yes - as there is no member at that schedule, customer will be allowed
No - as the member at '8' is of height '12', he would not allow a customer with height '5'

2. For (ii)
Yes - as the member at '7' is of height '12', he would allow a customer with height '15'
Yes - as there is no member at that schedule, customer will be allowed
