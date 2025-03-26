#include <stdio.h>

char naoascii(char str[]) {
    
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] < 0 || str[i] > 127) {
            return str[i];
        }
    }
    return '\0';
}

int main () {
    char palavra[] = "frófi";
    char resultado = naoascii(palavra);
    
    if (resultado != '\0') {
        printf ("O primeiro caractere não ASCII é: '%c'\n", resultado);
    } else {
        printf ("A palavra contém apenas caracteres ASCII.\n");
    }
    return 0;
}
