function to_roman(number)
    an=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
    rn=["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"]
    if number <= 0
        throw(ErrorException("error"))
    end
    i=1
    r=""
    while number > 0
        if number>=an[i]
            r=r*rn[i]
            number=number-an[i]
        else
            i=i+1
        end
    end
    return r
end

