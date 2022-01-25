
static int countDivisors(int number)
{
  int count = 0;
  for(int i = 0 ;i <= Math.ceil(Math.sqrt(number)) ; i++ )
  {
      if(number % i == 0)
        count++;
      if(i != n/i)
        count++;
  }
  return count;
}
