java -ms256m -mx512m -XX:PermSize=128m -XX:MaxPermSize=128 -classpath "jars/cyanspring-server-1.65.jar" com.cyanspring.server.bt.BackTest templates/DOLLAR_NEUTRAL.xml backtest/ticks/ANZ.AX.txt backtest/ticks/WBC.AX.txt backtest/ticks/BHP.AX.txt backtest/ticks/RIO.AX.txt