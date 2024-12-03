import kotlin.math.absoluteValue

val data = """71 73 74 76 78 80 77
78 81 84 87 87
37 40 43 46 50
12 13 15 17 18 19 21 27
4 5 2 4 5 6
53 54 56 58 59 56 54
26 29 31 34 35 33 35 35
60 62 61 63 64 68
89 90 91 94 93 98
42 43 45 45 47
81 84 86 87 90 90 91 90
53 56 56 58 58
30 33 35 36 36 40
1 3 4 7 10 12 12 17
56 58 60 61 65 67
1 3 4 8 10 12 10
36 38 40 44 47 47
21 22 23 27 28 29 31 35
32 34 37 40 44 45 48 54
55 58 59 66 67 70 73
30 33 39 40 42 39
70 73 76 81 81
4 5 11 12 13 17
77 79 82 87 88 95
55 52 53 54 56 57
79 76 78 79 76
16 15 17 19 20 20
71 70 73 74 76 80
81 79 82 85 87 89 96
26 23 26 23 25 28 30
74 72 75 77 79 76 77 74
56 53 56 59 62 63 62 62
42 41 40 41 45
40 39 40 38 41 43 44 49
20 17 18 18 20 22 25
9 8 8 11 10
85 84 84 87 89 90 93 93
89 88 89 89 93
35 34 37 40 43 43 49
62 61 64 66 68 70 74 76
53 50 53 54 55 59 60 57
24 21 23 27 29 31 31
55 53 56 59 63 66 70
12 11 13 17 22
78 77 82 85 87
72 71 74 77 84 83
72 69 72 78 81 82 82
13 12 15 17 22 23 27
82 79 85 88 93
76 76 78 80 82 83 85
91 91 93 95 93
24 24 27 30 30
20 20 23 26 27 30 31 35
65 65 66 67 73
67 67 65 68 71
4 4 1 3 4 7 8 6
26 26 24 27 27
4 4 7 8 7 8 9 13
39 39 40 41 38 41 46
37 37 39 39 40 43
74 74 77 77 80 81 83 80
67 67 67 70 71 73 73
83 83 86 87 87 90 94
85 85 88 90 91 92 92 98
28 28 30 34 37 40 43
50 50 53 57 54
31 31 34 36 37 39 43 43
50 50 52 54 58 59 62 66
44 44 47 49 53 58
57 57 59 62 63 64 69 72
73 73 76 82 85 86 83
46 46 49 56 58 58
35 35 36 42 46
8 8 14 15 18 19 25
31 35 36 38 40 41 42
5 9 12 14 11
39 43 46 48 49 52 54 54
14 18 19 21 24 28
11 15 17 18 23
58 62 63 60 62
78 82 80 81 82 85 88 85
77 81 84 85 83 84 84
40 44 41 44 45 46 49 53
40 44 46 43 44 51
4 8 10 10 11 13 15 18
5 9 11 11 12 15 16 13
16 20 23 23 25 25
68 72 75 75 78 82
61 65 65 67 70 77
73 77 81 84 85 87
15 19 21 22 26 27 28 26
16 20 22 26 29 31 31
76 80 84 86 89 93
43 47 49 50 54 61
60 64 66 73 74 76 79 81
79 83 85 87 90 92 98 95
33 37 39 40 45 45
37 41 47 50 51 53 57
50 54 59 62 65 72
25 30 32 33 34 37
64 71 73 75 78 77
70 76 77 79 82 83 84 84
25 31 32 34 37 39 42 46
14 19 21 22 23 24 27 34
58 64 63 64 67 68 69
86 93 95 96 94 92
15 20 19 21 21
34 40 39 41 42 43 47
48 54 56 54 57 62
43 50 52 53 53 54 55
9 16 19 19 17
25 30 31 31 32 32
72 77 78 78 80 82 83 87
53 60 61 64 64 65 72
76 82 84 88 89 91 92 93
55 60 63 67 65
43 50 52 55 58 62 64 64
70 77 81 83 87
16 21 23 27 29 32 38
74 80 81 83 86 91 92
40 47 50 51 57 54
33 39 46 49 51 51
53 60 66 67 70 73 74 78
53 59 60 61 67 74
66 63 60 58 56 57
88 85 84 83 83
57 54 51 50 49 45
26 23 20 19 16 11
78 75 74 75 73
48 47 49 46 44 47
17 15 16 14 11 11
56 54 55 53 49
55 54 52 55 49
80 79 79 77 76
21 20 17 14 12 12 15
41 39 38 38 38
51 49 47 44 44 40
30 27 27 26 25 18
37 35 31 28 25
83 80 76 73 72 71 70 72
90 87 84 81 79 75 75
48 47 46 42 40 39 35
31 29 25 24 21 16
58 56 49 46 44 43 42
43 41 39 32 29 30
17 16 13 6 5 5
47 46 43 40 37 32 31 27
86 83 80 79 73 68
84 85 82 79 78
28 29 26 25 22 24
51 52 50 47 44 44
59 61 58 56 54 50
21 22 20 18 11
61 62 60 61 59 57 56 55
94 97 98 96 93 96
77 80 77 74 71 68 71 71
88 91 89 90 86
24 27 25 24 21 19 20 14
59 60 60 59 56
80 82 82 81 79 76 73 75
23 25 25 23 23
24 25 23 23 19
96 97 95 94 94 87
60 61 59 55 53 50
88 89 85 83 85
71 72 69 68 66 63 59 59
92 95 91 88 84
96 98 95 91 89 82
35 37 36 33 30 24 23 22
52 54 47 45 43 46
82 85 80 79 79
14 16 13 6 5 1
55 58 53 52 51 50 48 41
26 26 25 23 20 17 16 14
95 95 92 91 94
20 20 18 16 13 10 7 7
29 29 28 26 22
21 21 19 18 17 16 15 9
16 16 13 11 14 11
82 82 81 80 81 82
52 52 51 50 52 49 46 46
42 42 41 43 42 41 37
42 42 41 43 38
28 28 27 27 25 24
10 10 8 8 5 3 6
68 68 66 66 63 61 61
32 32 30 30 27 25 21
98 98 98 96 93 91 84
42 42 39 35 34 31
89 89 85 82 80 81
53 53 50 48 45 44 40 40
25 25 21 18 15 12 8
68 68 64 63 57
95 95 92 86 85
94 94 93 91 88 81 80 83
26 26 21 18 15 15
24 24 22 17 13
28 28 27 26 23 17 16 10
43 39 37 34 33
33 29 27 24 23 21 24
30 26 24 21 19 19
74 70 67 66 65 62 58
57 53 50 48 45 38
61 57 54 53 52 55 53
38 34 36 33 32 29 27 29
89 85 83 85 85
37 33 34 32 28
91 87 86 84 83 81 82 77
90 86 84 84 83 82 80 79
20 16 14 14 16
98 94 91 91 89 88 87 87
71 67 64 62 59 58 58 54
61 57 57 54 53 47
34 30 28 24 21
34 30 26 24 27
16 12 9 7 3 1 1
75 71 67 64 62 59 56 52
95 91 89 85 80
31 27 24 19 16
55 51 44 41 43
51 47 40 38 38
56 52 47 44 40
60 56 53 51 50 43 37
30 23 21 18 15 12
51 44 41 38 35 36
80 73 71 68 67 67
48 41 40 39 38 36 33 29
69 63 61 60 55
71 66 67 65 63
48 42 39 37 34 36 38
92 85 84 85 83 83
33 27 24 23 26 24 23 19
16 11 13 12 5
98 93 90 90 87 84
18 12 12 11 9 7 4 6
10 4 4 3 3
15 9 9 8 5 1
94 87 86 86 83 76
60 54 50 48 47 44 42 40
54 49 45 43 40 41
83 78 75 73 69 66 66
31 24 23 19 16 14 10
89 84 81 77 74 68
75 70 69 66 60 57 54
91 84 79 76 78
66 59 56 54 49 46 46
28 23 21 14 10
88 83 81 74 69
9 12 14 17 20 21 18
75 76 79 80 82 83 84 84
15 16 18 20 22 26
68 69 72 73 78
75 76 78 76 78 79
83 86 88 90 92 94 92 90
55 56 58 60 58 58
66 69 68 71 75
58 60 59 60 65
66 67 69 71 72 72 75 77
39 42 43 45 47 47 46
82 84 85 87 90 90 91 91
1 2 2 4 8
10 11 12 14 14 15 20
20 22 25 29 31
62 64 66 70 69
67 69 73 75 78 78
55 57 60 64 68
14 17 19 20 24 26 31
2 3 8 10 13
20 23 26 29 36 34
69 71 76 78 79 82 82
31 33 35 38 43 47
37 39 45 48 50 52 58
17 15 16 19 20 23 25
17 14 17 19 22 24 27 24
46 44 47 49 52 55 56 56
55 53 55 56 58 60 63 67
7 5 6 8 11 12 18
69 67 70 71 72 70 72 74
88 85 87 86 85
13 10 12 13 10 12 12
58 56 57 58 56 60
68 67 66 68 69 76
9 7 9 10 12 14 14 15
34 31 32 35 37 37 36
26 23 24 25 28 28 30 30
70 67 68 68 72
85 82 84 84 85 91
12 9 13 15 18 20
56 54 57 61 60
58 57 58 62 65 65
60 58 62 64 67 71
56 55 57 61 63 70
30 29 36 38 40 41 43 44
59 56 59 61 67 69 68
32 30 35 37 40 41 41
59 57 62 64 67 70 72 76
65 62 65 68 75 77 82
5 5 8 10 12 14 15
59 59 61 64 66 67 70 68
36 36 37 40 42 43 45 45
74 74 76 77 81
27 27 30 31 33 35 36 42
74 74 76 75 77 79 80
41 41 40 41 40
82 82 83 84 82 84 86 86
40 40 38 41 43 46 50
18 18 21 20 25
13 13 13 16 17
47 47 49 49 47
17 17 19 19 22 23 24 24
43 43 45 45 49
1 1 1 4 9
43 43 47 49 51 52 55 56
58 58 60 61 64 68 67
16 16 19 20 23 27 27
55 55 58 62 66
23 23 24 26 28 31 35 42
76 76 79 84 85 87
82 82 84 91 89
44 44 46 51 52 52
66 66 69 76 77 79 83
36 36 41 42 45 50
17 21 23 24 27
45 49 51 52 55 53
23 27 29 31 31
44 48 49 51 52 54 58
6 10 12 15 20
66 70 73 72 74
34 38 41 43 41 40
28 32 34 32 32
16 20 23 24 27 29 28 32
62 66 63 64 67 70 75
18 22 23 23 26 28
5 9 10 11 12 12 15 12
15 19 19 22 24 24
43 47 49 49 53
61 65 67 67 73
12 16 17 21 24 27 28 30
1 5 8 12 10
78 82 84 87 89 93 96 96
70 74 76 78 81 85 88 92
72 76 77 79 82 86 93
57 61 62 69 70
34 38 40 42 45 52 55 52
54 58 60 65 68 68
77 81 87 90 92 96
2 6 11 12 19
21 26 27 30 32 33
43 48 50 51 49
78 84 87 89 91 92 94 94
42 49 51 54 57 60 63 67
57 62 65 68 70 77
85 92 89 90 91 93
10 15 17 19 18 20 19
33 40 38 41 42 45 47 47
17 24 25 27 29 27 31
83 88 86 87 89 94
24 30 32 35 35 36 38 39
78 83 84 84 85 87 88 85
11 16 17 18 19 19 21 21
86 91 94 94 98
43 48 50 50 53 60
68 74 78 81 82
30 37 40 43 47 45
26 33 37 39 39
48 54 55 58 62 64 65 69
46 51 53 57 62
38 45 50 53 55 56
29 34 40 41 42 43 45 44
2 8 9 15 16 19 19
4 9 14 17 18 20 23 27
20 26 28 33 39
68 65 64 63 61 62
11 8 6 3 2 2
31 30 29 28 25 23 22 18
90 88 85 83 80 73
26 24 22 21 19 21 18 17
20 17 14 13 16 14 16
10 9 8 10 8 6 3 3
59 56 54 57 54 51 47
99 96 95 92 93 92 91 85
76 74 72 72 70 67
67 65 63 61 58 58 57 59
37 35 32 32 30 30
86 84 81 80 80 79 78 74
88 85 83 83 80 79 74
89 87 84 81 77 76
75 72 70 69 66 62 64
48 46 45 44 43 39 39
49 47 46 42 39 37 33
72 70 68 64 62 57
82 80 77 72 69 68 66 64
62 60 58 56 54 49 47 50
68 65 63 56 53 53
35 32 31 24 20
24 23 22 15 8
56 57 56 55 54 51 50 49
89 90 89 86 88
27 30 28 26 24 21 19 19
89 90 87 86 83 79
62 65 62 60 57 56 49
73 74 75 72 69 68 66
72 74 77 76 73 74
25 28 29 26 23 20 19 19
86 87 88 87 85 82 78
85 88 86 89 86 85 84 79
17 20 19 18 18 16 15 14
16 19 16 16 15 16
92 93 93 91 91
85 86 85 82 82 80 76
58 60 60 59 56 51
75 76 74 70 69 68
79 82 78 77 76 73 75
40 42 38 36 34 34
28 29 27 25 21 20 16
69 71 67 64 63 57
39 41 38 36 29 27
50 52 51 45 44 43 45
88 90 87 85 78 78
34 36 34 31 25 23 20 16
93 94 89 86 84 83 76
57 57 54 53 50 47 46 43
86 86 85 83 85
66 66 65 64 62 61 58 58
91 91 89 87 84 80
95 95 92 91 89 87 85 78
27 27 24 23 26 24 21 20
81 81 78 75 73 76 73 76
11 11 12 9 9
38 38 39 37 36 32
50 50 47 50 49 42
19 19 19 17 14 12 10
19 19 16 13 13 15
7 7 6 4 3 3 1 1
25 25 25 24 22 20 16
53 53 50 48 48 45 38
28 28 24 22 21 18 17
78 78 75 73 69 68 70
97 97 96 93 92 88 88
56 56 54 50 46
88 88 87 83 81 80 79 72
22 22 20 19 16 11 8 7
42 42 41 40 34 33 35
34 34 31 24 21 19 16 16
25 25 18 17 13
36 36 33 31 29 26 21 16
56 52 49 47 45
80 76 73 72 71 70 72
57 53 52 49 49
37 33 32 30 28 25 23 19
97 93 90 88 87 80
89 85 88 85 82 81 80
26 22 21 22 24
98 94 92 89 90 89 89
40 36 35 33 32 29 31 27
21 17 14 12 11 8 11 5
57 53 53 50 49
76 72 71 71 72
65 61 58 55 55 55
25 21 18 18 14
34 30 30 29 26 23 17
32 28 24 21 18 15
98 94 93 91 90 86 89
17 13 9 6 5 3 3
79 75 74 70 68 64
28 24 20 19 16 13 12 6
72 68 66 63 62 59 53 52
50 46 45 39 40
98 94 92 89 83 83
50 46 44 38 35 34 30
34 30 24 22 16
48 43 40 37 34 32
57 50 47 45 43 46
98 92 90 88 86 83 82 82
81 75 72 70 69 68 64
20 14 12 11 9 4
22 17 18 17 16 14 13
51 44 45 44 41 44
53 46 45 48 48
41 34 37 34 31 28 27 23
57 50 47 46 45 44 47 41
31 26 26 23 20 18
92 87 86 86 83 84
91 84 82 82 81 79 76 76
59 54 54 51 50 49 47 43
31 26 26 23 22 15
61 54 52 48 45 43
98 92 88 87 88
86 80 79 75 72 70 69 69
21 15 11 10 6
87 82 78 75 69
52 46 41 38 37
82 77 71 68 69
35 28 27 21 21
83 78 77 71 69 67 65 61
84 77 75 70 67 62
64 64 62 58 56
55 62 64 66 67 74 78
55 48 47 44 43 43 44
84 85 81 78 76 71
1 5 9 12 14 14
59 59 55 53 50 46
19 25 26 29 29 32 34 38
68 69 70 76 79 77
77 72 71 70 67 67 67
80 80 82 81 84 85 85
37 35 37 39 42 45 47 45
47 43 40 38 36 38 38
93 86 83 81 79
79 81 82 82 87
94 90 89 87 81 78 76 71
46 44 38 35 37
28 35 36 37 43 40
34 31 35 37 38 41 42 46
84 77 71 68 65 66
65 64 62 56 53 50
38 45 46 49 53 55 57 57
34 41 43 47 51
26 24 21 22 20 13
42 47 51 52 55 58 65
52 51 48 45 40 38 38
54 51 54 56 56 60
27 26 29 30 31 35 37 37
64 68 70 73 74 77 78 83
64 62 61 59 55 48
37 35 33 33 33
32 33 33 34 35 37 37
24 25 23 20 20 17 15 10
61 64 62 60 63 57
98 99 92 90 89 88 81
21 21 23 25 23 25 28 31
37 40 41 44 44 48
46 49 50 49 46 43
73 78 76 77 80 79
56 52 51 50 50 48 41
50 49 46 47 44 44
59 63 70 71 73 76 79 84
47 47 49 51 53 57 59 56
8 7 7 5 1
19 18 20 22 23 24 26 30
4 8 8 10 12 16
66 63 62 59 62 60
25 28 25 26 29 32 35
76 80 80 82 85 87 87
69 69 70 71 73 73
19 13 10 7 6 2
26 25 31 33 33
82 85 86 90 94
96 99 98 94 97
59 59 58 55 52 48 46 40
79 83 84 86 93 94 98
30 26 22 20 17 13
35 36 39 37 40 43 43
63 61 59 55 54 52
49 44 40 38 37 37
22 18 16 14 13 9 6
66 73 76 77 77
11 15 17 14 16 18 16
82 81 80 78 77 76 72 74
82 82 84 86 86 87 87
58 54 52 50 49 43 42 41
55 56 62 65 67 69 73
32 35 33 33 31 28 31
46 53 56 57 59 58
69 67 60 57 56 53 49
79 86 89 90 90 91 94 92
73 71 70 67 70 73
40 40 41 44 45 46 47 51
35 42 45 48 55 56 61
75 75 68 67 63
25 25 27 30 36 40
6 9 11 13 16 18 16 22
63 63 62 65 65
68 62 60 56 57
24 20 18 17 14 16
87 87 86 83 80 77 74 77
81 76 78 77 75
29 22 21 17 14 13 6
18 16 23 26 27 31
46 46 49 50 52 49
47 40 37 37 34
33 34 37 39 41 42 41 39
39 38 36 39 41 42 42
81 81 80 78 77 79 76 77
51 55 57 57 56
87 90 89 87 83 81 81
73 70 67 65 63 60 57 53
76 80 78 80 83 85 85
57 57 61 63 64 67 71
81 84 81 80 77 75 72 69
30 29 30 33 35 42 49
7 7 10 11 12 12 13 18
21 21 23 25 26 30 30
78 84 86 86 89 91 91
15 20 22 23 24 28
75 71 68 65 63 60
51 52 46 43 41 38 37
70 75 78 80 83 87 88 86
50 43 40 38 36 34 33 28
92 88 82 81 80 83
47 47 44 46 42
17 13 15 13 9
15 15 13 11 11 11
46 46 43 42 40 34 36
79 81 77 74 70
7 11 16 19 22 22
62 62 61 57 56 59
27 31 32 31 36
65 69 68 71 73 76
77 77 78 81 87
8 5 6 9 10 10 16
62 63 60 60 60
91 91 87 85 82 80 80
49 49 51 49 47 42
62 58 57 55 54 52 48
19 23 25 25 30
26 29 33 36 39 39
19 23 27 29 31 34 36 37
46 46 46 44 40
58 53 46 43 42
27 34 35 36 37 34 37 39
28 30 32 31 27
55 56 53 52 52
46 46 49 55 57 59 60 59
64 64 62 60 59 56 51 46
16 20 21 23 25 22
26 22 19 15 16
40 35 35 34 33 27
95 89 87 85 83 82 84 80
14 21 22 20 21 25
59 59 56 54 55 52 51
28 30 29 27 23
54 60 64 66 68
97 99 96 93 92 91 91 90
14 15 16 16 14
63 63 61 61 64
12 12 16 17 19 20 23
12 11 9 11 13 15
62 69 76 77 79 79
20 19 21 18 19 25
77 73 72 70 69 62
22 22 22 20 19 16 14
51 55 56 59 57 61
91 95 97 99 99
42 41 42 45 46 49 56
63 59 56 55 54 48 44
67 68 66 64 64 62 58
34 38 41 44 46 50 55
82 79 81 83 85 86 83 81
81 77 75 74 72 74 68
41 42 40 35 34 30
32 36 38 42 39
20 24 27 27 30 31 33
22 28 31 33 34 37 38
34 33 33 36 39 42 45 47
40 43 45 47 49 47
45 39 36 31 24
56 52 50 49 46 45 45
75 78 80 77 76 75 73 76
88 85 82 81 80 77 77 74
96 90 88 86 84 83 77 73
69 69 67 65 62
4 4 6 7 11 18
83 83 81 80 77 76 73 69
76 70 67 66 64 60 58
38 33 32 30 29 26 26
36 36 37 40 40 43 44 41
30 29 26 24 21 19 13 8
22 18 15 14 14 15
89 87 90 91 92 89 93
66 62 58 57 56 53 52 47
86 87 84 82 79 73
70 66 62 61 58 55 55
25 26 23 22 19 15 13
58 60 67 68 69 71
29 27 25 23 20 19 17 20
30 29 35 38 41 43 40
58 59 56 49 46 46
33 33 35 36 38 41 42 45
49 49 49 48 46 39
51 45 44 41 43
13 13 10 11 14 11
30 29 27 27 29
37 32 30 27 30 30
15 10 5 3 2 1 1
20 17 21 22 24 26 29
51 54 53 46 45 42 44
73 73 72 70 65
41 43 46 49 54 57 60 67
37 43 43 45 47 53
2 2 4 6 7 7 9 13
42 49 48 50 52 54 57 57
27 26 28 31 32 34 34
78 78 79 82 83 82 88
84 80 77 77 73
87 86 82 79 78 78
35 32 30 29 25 23 19
15 19 25 28 27
64 66 67 71 74 76
67 68 70 73 76 78 85
89 89 92 92 93 96
57 61 62 63 67 69 72 76
71 70 74 77 78 80 79
86 83 86 83 81 77
66 66 64 63 62 62
76 79 81 82 83 84 88
59 62 63 64 66 69 72 72
55 51 49 49 47 45
21 21 20 22 24 26 29 33
91 94 92 89 88 89
49 51 52 56 59 64
97 97 96 94 92 87 85 85
42 39 39 38 37 34 33 27
94 90 87 86 83 83 82 82
54 50 47 40 40
75 79 81 84 87 89 92 94
30 37 35 37 39 40 41 46
66 65 65 66 69 71 69
97 94 91 90 90
32 30 28 25 22 19 12
76 72 71 69 67 64 67 68
39 38 35 32 30 28
41 38 37 36 34 33
33 34 36 37 38 39 42
39 36 34 31 28
18 15 12 11 8
68 65 62 59 57 56
35 33 32 31 28 25 24 21
18 15 14 12 11
88 85 84 81 78 75
88 86 83 82 81
24 26 29 30 32 34 36 38
26 25 23 21 19
97 96 95 94 91
67 66 64 62 59
56 57 59 62 63 66 68 70
30 32 34 35 36
24 27 28 30 33
75 73 71 70 68 65 62
88 85 84 82 80 78 75
7 9 12 14 16
58 55 52 50 47 45
38 40 42 43 46 49
44 47 48 50 52 53 55 56
42 40 38 35 32 29
75 77 79 82 84 87 90 92
24 23 21 18 16
79 76 73 72 71 68
84 85 86 87 90 91
88 85 83 80 79
71 73 74 77 79 81 84 86
86 87 90 91 93 94 95 96
19 16 13 10 7 4
57 58 59 61 63 64 65
22 25 28 31 34 35 38 41
45 47 49 51 52 54 55 58
39 36 34 33 31 28 25
33 31 28 27 24 21 18
31 33 34 37 38
63 65 68 70 73 76
24 25 26 27 28 29 30
9 11 13 15 17 20 21 22
76 73 72 69 67 65 64 63
7 8 11 14 15 16
43 41 38 35 34 31 30
26 25 24 23 22
7 9 11 14 15 18
28 25 24 23 21 20 19 18
81 82 84 87 89 90 92 95
76 74 72 71 68 65
24 23 21 18 16 14 13 12
45 47 50 51 54 56 59
51 54 55 56 58 60 62 63
69 71 74 77 80 82 84
91 89 87 85 84
99 97 96 93 90 89 88 87
74 75 78 79 80 81 83
27 28 30 33 36 37 38
9 10 11 14 15
29 31 33 36 39 40 42 45
9 10 13 16 19 20
68 71 73 74 76 79 80 82
2 4 7 9 10 12
69 68 67 66 65 62 60 58
8 9 10 12 15
64 67 70 73 76 79 80
57 59 62 63 65 67
2 3 6 9 11
23 21 20 18 16 14 13 12
96 94 93 90 89 88
78 75 73 72 71 69
83 85 86 89 90 92 95
21 19 18 17 14 13
94 91 90 87 84 83 82
69 70 73 74 76 79
35 38 40 41 43 44 46 49
40 42 44 45 46 47 48
3 4 6 8 9 11
48 46 43 42 40 38 36
41 40 37 36 35
38 36 35 33 31
14 13 10 7 6 4 1
20 19 18 17 14 12 10 9
27 28 30 31 32 33 36
91 90 88 86 85 83
13 15 17 18 19 22
30 33 36 38 41 44
19 16 14 13 10 9 7 6
72 69 66 63 60 59 56
11 14 17 18 19 22 24
18 16 14 12 10
41 40 39 38 36 33 30
42 45 47 49 50
24 27 30 33 36 39 40 43
85 83 81 79 78 75 74 71
79 76 74 71 68
76 75 72 70 68
69 66 65 64 63 61
36 33 31 29 27 26 24
33 30 29 26 23
86 87 88 90 92 93 95
26 28 31 34 37 39 41 44
45 44 43 42 41
28 26 25 23 22 19 18 17
65 63 61 60 57 55 52
73 71 70 69 67
69 72 73 75 78
89 90 92 93 95
45 42 39 36 35 33
52 55 57 59 61 62 63
70 67 64 62 61 60
23 25 27 30 32 34 37
10 13 14 15 16 19 21 23
73 70 68 66 65 64 62 60
64 66 67 69 70 71
27 26 23 20 17 16
73 74 75 77 80 81
81 80 77 74 73
84 82 79 78 77 76 74 71
33 32 31 28 27 26
26 23 21 19 18 16 13
43 44 45 48 50 52
30 28 25 23 22 19 17 14
25 26 28 29 30 31 32 33
39 40 41 43 44 45 48
7 10 11 13 15 17
51 49 47 46 45
78 79 81 84 87 88
16 18 19 22 24
76 75 74 72 70 67
94 91 88 85 84
42 39 36 33 30 28 27
53 50 48 45 44
72 70 67 64 63 60 57 54
89 86 84 81 79 77 76
76 79 80 83 85 86 88
1 3 4 5 6 9
12 14 15 17 20 23 26 27
32 34 36 39 42 43 45 46
85 83 82 80 79 77 75 74
92 89 88 85 83 80 79
82 81 78 75 73
2 3 5 7 9
62 61 59 58 56 54
39 40 41 44 47 48 50
14 11 10 9 8 6
61 62 65 68 70 71 74
46 47 50 53 54 57 59
74 72 71 69 68 67 66 63
74 77 80 83 85 87 90 92
45 42 41 38 36 33 30
15 14 12 11 8 6
92 90 87 86 85 83
24 23 22 20 19 18 17
27 28 31 32 33
87 90 93 95 98
45 48 49 50 53 54 55
33 31 30 28 25 23 20 17
35 37 38 40 41 44
82 81 78 77 76 75 72 69
20 23 24 27 29
18 21 23 26 28 30
30 28 25 22 21 18
32 29 27 24 21 20
59 61 64 67 70 73 74 77
28 29 31 33 35 36 37
10 12 15 17 19 21 23 24
28 31 34 36 39
83 80 77 76 73 70 69 68
79 81 83 86 89
63 65 68 71 73 76
80 79 76 74 73
73 71 68 65 63 61
14 11 8 7 6
7 9 11 12 13 16
68 71 74 77 80 82 83
37 35 33 32 31 29 28
93 91 89 86 83 80 77
12 13 15 17 20 22 23
4 7 9 10 12 14
55 52 50 49 46
62 60 59 57 56 54 51 50
82 79 77 76 73 70 69 67
74 71 68 65 63 62 60 57
74 77 78 81 82
68 65 62 60 57
21 19 17 16 13 10 8
42 45 48 49 52 55
8 10 12 14 16 19
59 56 53 52 49 47
59 56 54 53 50 49 48
85 82 81 79 77 74
73 70 67 66 65 64 62
38 35 33 30 27
41 42 45 46 47
47 46 45 42 40
20 23 24 25 27
70 72 73 76 79 80 81
60 62 63 64 67
76 77 80 81 84 85 88 90
43 41 38 36 33 32 30
16 18 21 24 25
45 42 40 39 37
96 93 91 89 87 85 84 82
21 24 25 28 31 33 35 37
74 71 68 65 64 62 59
4 5 8 9 11 13
49 50 53 54 56 59
99 97 95 93 92 90 88 85
73 75 78 79 80
10 13 15 17 20 23 26
79 77 76 73 70 69 67 65
18 16 13 10 7 5 4
59 56 53 50 49
76 79 81 82 85 87 90
16 18 19 20 22 25 26 28
71 68 67 64 63 60
14 15 16 18 19
24 22 20 17 15 12
49 52 54 56 58
43 41 40 38 35 32 31 29
40 37 35 33 31 29 28 26
68 70 72 75 76 79 81 84
16 15 14 12 9 8
1 3 4 5 8 11 14 15
78 76 73 70 69 67 65
82 80 78 76 73 72 69
54 55 58 61 63 65 66 68
96 93 90 88 86 85 84 82
93 91 90 88 87
83 81 79 78 76 73 71 68
97 95 92 89 88
78 79 82 84 86 87 90 93
94 92 90 89 87 85 82 79
36 38 41 42 43 44
19 16 14 11 9 8
59 58 55 53 52 49 46 43
74 76 79 81 84 86 87
50 47 44 41 40
26 25 22 21 19
17 19 20 21 22 25 27
80 83 86 89 92 95
36 38 40 41 42 43
97 94 91 88 85
11 14 16 17 20 22 23
64 62 59 57 56 53 52
2 3 4 6 8 11 12 15
64 62 59 58 56
88 89 92 94 96 97 98 99
12 11 9 6 4
68 66 65 62 59
51 54 55 57 60 63
6 7 9 10 13 15 16 18
62 61 58 56 55 53
41 38 36 34 32
63 64 66 67 70 72 74 75
51 52 54 55 57 59 61 63
42 40 39 36 35
57 59 60 61 62 63
31 32 35 38 39 40
85 87 90 93 94 95 98
90 87 86 84 83 82
52 50 48 46 44 41 40 37
28 29 32 33 35
34 37 40 41 42 43
68 67 65 64 61
32 30 28 27 24 21 19 16
25 22 21 20 18
68 66 64 62 61 60
55 56 57 59 62 65 66
13 14 17 18 20 23 24 25
17 14 11 9 8 6
32 30 27 26 25
16 18 21 23 26 29 30
34 37 38 39 40 43 45 47
20 22 24 26 29 31 32 33
57 56 53 50 47 44
59 62 64 66 68
68 70 73 75 77
35 33 30 27 26 25 24 23""".trimIndent()

var safeTotal = 0
var reportTick = 0
var levelTick = 0
var increasing = false

fun main () {
    val reportList = data.split("\n")
    for (element in reportList) {
        var report = element.split(" ")
        if (checkReport(report) == true) {safeTotal += 1}
        println(report)

    println(safeTotal)
}

fun checkReport(report: List<String>):Boolean {
    if (report[1] > report[0]) {
        increasing = true
    }else{
        increasing = false
    }

    if (increasing) {
        return report.zipWithNext().all { (a, b) -> (a < b) && ((a.toInt()-b.toInt()).absoluteValue <= 3)}
    }else{
        return report.zipWithNext().all { (a, b) -> (a > b) && ((a.toInt()-b.toInt()).absoluteValue <= 3)}
    }
}