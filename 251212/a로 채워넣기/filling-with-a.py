str1 = input()

# 문자열을 리스트로 변환
lst = list(str1)

# 앞에서 2번째 문자 → index 1
lst[1] = 'a'

# 뒤에서 2번째 문자 → index -2
lst[-2] = 'a'

# 다시 문자열로 합치기
result = ''.join(lst)

print(result)

