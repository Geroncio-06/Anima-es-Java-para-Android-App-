

-------------------------- ANIMATION ROTATE POR YOYO LIB ------------------------------------------------------------------------------------


1 - No Build Gradle (Module:app) implemente essas libs:


	implementation 'com.daimajia.androidanimations:library:2.4@aar'


2 - Na Activity JAVA do objeto a ser animado:

	Button  btnsub 			// esse button só é o disparador da animação
	TextView textview; 		// objeto a ser animado


	------- em OnCreate:----------------------------------------------------------------------------------------------------------------------


	btnsub = findViewById(R.id.btnsub);
	textview = findViewById(R.id.texto);


	btnsub.setOnClickListener(new View.OnClickListener() {
            
	    @Override
            public void onClick(View param1view) { 						  // ENTRAR GIRANDO 

                YoYo.with(Techniques.RotateIn).duration(700).playOn(Main2Activity.this.textview); // ENTRAR GIRANDO 

            }
        });


3 - Outras Animações Rotate:

		YoYo.with(Techniques.RotateInDownLeft).duration(700).playOn(Main2Activity.this.textview);     // ENTRAR GIRANDO PELA ESQUERDA E PARA BAIXO

		YoYo.with(Techniques.RotateInDownRight).duration(700).playOn(Main2Activity.this.textview);    // ENTRAR GIRANDO PELA DIREITA E PARA BAIXO

		YoYo.with(Techniques.RotateInUpLeft).duration(700).playOn(Main2Activity.this.textview);       // ENTRAR GIRANDO PELA ESQUERDA E PARA CIMA

		YoYo.with(Techniques.RotateInUpRight).duration(700).playOn(Main2Activity.this.textview);      // ENTRAR GIRANDO PELA DIREITA E PARA CIMA




		YoYo.with(Techniques.RotateOut).duration(700).playOn(Main2Activity.this.textview);             // SAIR GIRANDO 

		YoYo.with(Techniques.RotateOutDownLeft).duration(700).playOn(Main2Activity.this.textview);     // SAIR GIRANDO PELA ESQUERDA E PARA BAIXO

		YoYo.with(Techniques.RotateOutDownRight).duration(700).playOn(Main2Activity.this.textview);    // SAIR GIRANDO PELA DIREITA E PARA BAIXO

		YoYo.with(Techniques.RotateOutUpLeft).duration(700).playOn(Main2Activity.this.textview);       // SAIR GIRANDO PELA ESQUERDA E PARA CIMA

		YoYo.with(Techniques.RotateOutUpRight).duration(700).playOn(Main2Activity.this.textview);      // SAIR GIRANDO PELA DIREITA E PARA CIMA

		

