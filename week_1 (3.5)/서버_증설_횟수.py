def solution(players, m, k):
    count = 0
    servers = [0] * 24
    temp_use = 0
    
    if (m == 1 and k == 1) :
        return (sum(players))
    
    elif (k == 1) :
		    # 여기서 실수함
        answer = [x // m for x in players]
        return (sum(answer))
    
    else :
        for i in range(len(players)) :
            member = players[i]
            server = servers[i]

            use = member // m

            if (use > server) :
                servers[i:i+k] = [x + (use - server) for x in servers[i:i+k]]
                count += (use - server)

            else :
                continue
            
        return count