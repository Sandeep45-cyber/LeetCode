package BinarySearch;

public class SmallestLetter {

    static void main(String[] args) {

        char[] arr = {'a', 'c', 'g', 'k', 'l'
        };

        char target = 'j';
        char answer = smallestCharacter(arr, target);
        System.out.println(answer);

    }

    static char smallestCharacter(char[] arr, char target)
    {
        int start = 0;
        int end = arr.length -1;

        while(start <=  end)
        {
            int mid = start + (end - start)/2;

            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return arr[start % arr.length]; // WRAPPING
    }
}
