### Casino test task 
#### About: 
Simple application that simulate a million games and show win chance. 
#### Slot Game total win / total bet:
1. total games = games(1.000.000) + (games(1.000.000) * free games win chance(10) * 0.01); result(1.100.000)
2. win coins = total games(1.100.000) * credit(10) * win chance(30) * win boost(2) * 0.01; result(6.600.000)
3. free games coins back = total games(1.100.000) * free games win chance(10) * 0.01; result(1.100.000)
4. total win / total bet = (win coins(6.600.000) + free games coins back(1.100.000)) / (games(1.000.000) * credit(10)); result(0.77)