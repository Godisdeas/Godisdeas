def CheckPassword(str,n):
    if n<4:
        return 0
    if str[0].isdigit():
        return 0
    cap=0
    nu=0
    for i in range(n):
        if str[i]==' ' or str[i]=='/':
            return 0
        if str[i]>='A' and str[i]<='Z':
            cap+=1
        elif str[i].isdigit():
            nu+=1
    if cap>0 and nu>0:
            return 1
    else:
            return 0

str=input()
a=len(str)
print(CheckPassword(str,a))