package com.example.recycler_view_arnau;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Geographic> geographics = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        initData();

        MyAdapter myAdapter = new MyAdapter(geographics, this);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false));
    }

    private void initData(){
        Geographic geographic1 = new Geographic(
                "Baobab Tree",
                "https://www.nationalgeographic.com.es/medio/2022/01/05/waterfall-and-baobab-tree_3887ddc0_2000x1333.jpg",
                "Cataratas Ruacana, Namibia",
                "\"Al llegar a este lugar en la frontera norte de Namibia, tuve la suerte de que las cascadas tuvieran agua. Buscando buenos ángulos para fotografiar el baobab con las cataratas que fluyen detrás de él, subí acantilados muy empinados mientras cargaba con mi equipo y mi trípode. Mis manos y rodillas ensangrentadas y la espera de tres horas por la mejor luz valieron la pena\"."
        );
        geographics.add(geographic1);
        Geographic geographic2 = new Geographic(
                "Los guardianes",
                "https://www.nationalgeographic.com.es/medio/2021/12/08/los-guardianes-del-lago_de8851ef_1152x769.jpg",
                "Dakota del Norte, Estados Unidos",
                "Después de seguir el clima espacial durante los días anteriores, sabía que era muy probable que las luces se vieran durante este otoño, así que fui a uno de mis lugares favoritos y preparé mi equipo con la esperanza de que aparecieran las auroras boreales…¡Y lo hicieron! Me quedé asombrado cuando bailaron por encima de mi cabeza y por fin pude capturar algunas imágenes con las que había soñado."
        );
        geographics.add(geographic2);
        Geographic geographic3 = new Geographic(
                "Higher prediction",
                "https://www.nationalgeographic.com.es/medio/2021/12/08/higher-prediction_f989f6d2_1152x847.jpg",
                "Noruega",
                "El norte de Noruega ofrece algunas de las vistas más bonitas y espectaculares que puedes encontrar en el norte de Europa. Algunas noches, llegan predicciones de fuertes auroras boreales que muchas veces desencadenan increíbles espectáculos de luces que se extienden por todo el cielo. Las bajas temperaturas forman hielos junto a la orilla del río y estas estructuras ayudan a crear la composición perfecta en las fotografías de la Aurora."
        );
        geographics.add(geographic3);
        Geographic geographic4 = new Geographic(
                "Santa´s Cabin",
                "https://www.nationalgeographic.com.es/medio/2021/12/08/santas-cabin_26d856a5_864x1080.jpg",
                "Levi, Finlandia",
                "Sé que el viaje es a menudo más importante y memorable que los resultados, y después de tomar esta foto, puedo decir que fue un viaje para el recuerdo. No fue una caminata larga, pero cuando no tienes raquetas de nieve y te hundes medio metro con cada paso que das, la ruta parece cincuenta veces más larga. La próxima vez que vaya, llevaré sin duda mis esquís. Todo el camino estaba parcialmente nublado y sin señales de auroras boreales, pero finalmente conseguí capturar lo que buscaba. También logré conseguir algunas tomas bastante decentes de la Vía Láctea de invierno antes de que comenzara el espectáculo, lo que sin duda fue la guinda del pastel de la noche."
        );
        geographics.add(geographic4);
        Geographic geographic5 = new Geographic(
                "La catedral",
                "https://www.nationalgeographic.com.es/medio/2021/12/08/la-catedral-de-la-aurora_0818b67e_1393x1080.jpg",
                "Senja, Noruega",
                "Esta imagen es la representación perfecta de una de mis mejores noches viendo la aurora boreal en Noruega desde la isla de Senja. Las vistas eran impresionantes con paisajes nevados, montañas espectaculares, y una Aurora que bailaba y coloreaba todo de verde. Fue realmente una noche para recordar. Las condiciones eran perfectas; no hacía demasiado frío, y la aurora boreal apareció poco después de llegar, durando mucho tiempo. Volví a casa muy feliz y agradecida por esta increíble experiencia."
        );
        geographics.add(geographic5);
        Geographic geographic6 = new Geographic(
                "Road to Ruin",
                "https://www.nationalgeographic.com.es/medio/2021/10/12/road-to-ruin_d47d9693_1280x853.jpg",
                "Fotografía galardonada con el primer premio en la categoría: Wetlands: The Bigger Picture",
                "Dividiendo el humedal en dos, esta carretera fue construida en la década de 1980 para proporcionar acceso a una playa. El humedal de marea es el hogar de más de un centenar de especies de aves entre las que pueden encontrarse desde águilas pescadoras a abejarucos, pasando por decenas de migratorios estacionales."
        );
        geographics.add(geographic6);
        Geographic geographic7 = new Geographic(
                "Luna Dunes",
                "https://www.nationalgeographic.com.es/medio/2021/09/15/luna-dunes_f0f15bdd_949x533.jpg",
                "Fotografía ganadora en la categoría: Skyscapes",
                "Un luna creciente y humeante flota en una atmósfera azul océano sobre las tranquilas y brillantes dunas de arena. El fotógrafo caminó profundamente en las dunas y finalmente encontró el primer plano que había imaginado para esta toma. Una vez que todo estaba montado, levantó la vista y allí colgaba una astilla brillante de una luna creciente que delineaba su rostro oscuro pero visible."
        );
        geographics.add(geographic7);
        Geographic geographic8 = new Geographic(
                "Forest",
                "https://www.nationalgeographic.com.es/medio/2021/08/28/forest-of-reflection_5fb46941_1200x757.jpg",
                "Fotografía ganadora del primer premio en la categoría: Landscape",
                "Una hermosa escena con la que me encontré una tarde mientras exploraba un lugar para una sesión de fotos. Vi estas cortezas de papel en el agua creando reflejos impresionantes, con algo de luz dorada enfatizando los árboles. Vambié a mi lente gran angular y tomé algunas instantáneas antes de que la luz se desvaneciera."
        );
        geographics.add(geographic8);
        Geographic geographic9 = new Geographic(
                "The Surface",
                "https://www.nationalgeographic.com.es/medio/2021/08/28/beneath-the-surface_20bd6eda_1200x799.jpg",
                "Fotografía ganadora del segundo premio en la categoría: Landscape",
                "Para algunos, las puestas de sol son un momento para la reflexión y la meditación. Para mí, combinar una puesta de sol ardiente con los prístinos jardines de coral del arrecife de Ningaloo bajo la superficie vítrea del océano trae un nuevo nivel de tranquilidad. Combinando dos mundos para crear un momento perfecto."
        );
        geographics.add(geographic9);
    }

}