#include <iostream>
using namespace std;

enum Weather {SUNNY = 0, CLOUD = 10, RAIN = 20, SNOW = 30};

 

int main(void)

{

    int input;

    Weather wt;

 

    cout << "¿À´ÃÀÇ ³¯¾¾¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä : " << endl;

    cout << "(SUNNY=0, CLOUD=10, RAIN=20, SNOW=30)" << endl;

    cin >> input;

    wt = (Weather)input;

 

    switch (wt)

    {

        case SUNNY:

            cout << "¿À´ÃÀÇ ³¯¾¾´Â ¾ÆÁÖ ¸¼¾Æ¿ä!";

            break;

        case CLOUD:

            cout << "¿À´ÃÀÇ ³¯¾¾´Â Èå¸®³×¿ä!";

            break;

        case RAIN:

            cout << "¿À´ÃÀÇ ³¯¾¾´Â ºñ°¡ ÁÖ·èÁÖ·è ¿À³×¿ä!";

            break;

        case SNOW:

            cout << "¿À´ÃÀÇ ³¯¾¾´Â ÇÏ¾á ´«ÀÌ ³»·Á¿ä!";

            break;

        default:

            cout << "Á¤È®ÇÑ »ó¼ý°ªÀ» ÀÔ·ÂÇØ ÁÖ¼¼¿ä!";

            break;

    }

 

    cout << endl << "¿­°ÅÃ¼ WeatherÀÇ °¢ »ó¼ý°ªÀº " << SUNNY << ", " << CLOUD << ", "

        << RAIN << ", " << SNOW << "ÀÔ´Ï´Ù.";

    return 0;

}