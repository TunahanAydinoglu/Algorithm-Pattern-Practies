// See https://aka.ms/new-console-template for more information


int[] numbers = [23, 56, 2, 19, 34, 7, 41, 13, 68, 10, 29, 50, 15, 37,
    4, 61, 45, 6, 27, 59, 12, 18, 48, 1, 70, 31, 54, 21, 8, 65, 42, 30,
    11, 5, 58, 24, 17, 47, 49, 16, 35, 64, 39, 25, 60, 14, 44, 36, 66, 3, 28,
    52, 46, 67, 63, 33, 51, 53, 38, 32, 69, 55, 20, 62, 22, 26, 9, 43, 40, 57
];

string[] metallica = ["Kirk Hammett", "James Hatfield", "Robert Trujillo", "Lars Ulrich"];

BubbleSort(numbers);
Console.WriteLine(string.Join(", ", numbers));

BubbleSort(metallica);
Console.WriteLine(string.Join(", ", metallica));


void BubbleSort<T>(IList<T> values) where T: IComparable
{
    for (int i = 0; i < values.Count; i++)
    {
        for (int j = 0; j < values.Count -i - 1; j++)
        {
            var isBiggerThanNextVal = values[j].CompareTo(values[j + 1]) > 0;
            if (isBiggerThanNextVal)
            {
                // swap positions
                (values[j], values[j + 1]) = (values[j + 1], values[j]);
            }
            
        }
    }
}