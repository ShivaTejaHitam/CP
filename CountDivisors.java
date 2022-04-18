
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
// she lied me abt crush. lied that she is introvrt in school and stayed away from bad girls
