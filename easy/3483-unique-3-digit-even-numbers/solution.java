            if(num % 2  == 0 ) {
                even++;
            }  
        }

        return ( digits.length - zero - 2 )*(digits.length-1)*(even);
        
    }
}
