String[] input = new String[size];
boolean isDouble = false;

for (int i = 0; i < size; i++) {
    input[i] = scanner.next();
    if (input[i].contains(".")) {
        isDouble = true;
    }
}

if (isDouble) {
    Double[] arr = new Double[size];
    for (int i = 0; i < size; i++) {
        arr[i] = Double.parseDouble(input[i]);
    }

    ArrayProcessor<Double> processor = new ArrayProcessor<>(arr);

    if (processor.isIncreasingOrder()) {
        System.out.println("Ratings are in increasing order.");
        processor.printRatings();
    } else {
        System.out.println("Ratings are not in increasing order.");
        processor.sortRatings();
        processor.printRatings();
    }

} else {
    Integer[] arr = new Integer[size];
    for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(input[i]);
    }

    ArrayProcessor<Integer> processor = new ArrayProcessor<>(arr);

    if (processor.isIncreasingOrder()) {
        System.out.println("Ratings are in increasing order.");
        processor.printRatings();
    } else {
        System.out.println("Ratings are not in increasing order.");
        processor.sortRatings();
        processor.printRatings();
    }
}
