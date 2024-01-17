// See https://aka.ms/new-console-template for more information

int[] numbers = [23, 56, 2, 19, 34, 7, 41, 13, 68, 10, 29, 50, 15, 37,
    4, 61, 45, 6, 27, 59, 12, 18, 48, 1, 70, 31, 54, 21, 8, 65, 42, 30,
    11, 5, 58, 24, 17, 47, 49, 16, 35, 64, 39, 25, 60, 14, 44, 36, 66, 3, 28,
    52, 46, 67, 63, 33, 51, 53, 38, 32, 69, 55, 20, 62, 22, 26, 9, 43, 40, 57
];

string[] blackSabbath = ["Tony Iommi", "Bill Ward", "Geezer Butler", "Ozzy Osbourne"];

SelectionSort(numbers);
Console.WriteLine(string.Join(", ", numbers));

SelectionSort(blackSabbath);
Console.WriteLine(string.Join(", ", blackSabbath));

void SelectionSort<T>(T[] values) where T: IComparable
{
    for (int i = 0; i < values.Length; i++)
    {
        int minIndex = i;
        for (int j = i+1; j < values.Length; j++)
        {
            var isSmallerThanNextValue = values[j].CompareTo(values[minIndex]) < 0;
            
            if (isSmallerThanNextValue)
            {
                minIndex = j;
            }
        }
        
        // swap positions
        (values[i], values[minIndex]) = (values[minIndex], values[i]);
    }
}