## Steem Python



### steem 설치시 scrypt 에러 발생

```shell
  scrypt-1.2.0/libcperciva/crypto/crypto_aes.c:6:10: fatal error: 'openssl/aes.h' file not found
  #include <openssl/aes.h>
           ^~~~~~~~~~~~~~~
  1 error generated.
  error: command '/usr/bin/clang' failed with exit status 1
  
  ----------------------------------------
  Failed building wheel for scrypt
```

- 해결 방법
https://pypi.python.org/pypi/scrypt/

```shell
$ export CFLAGS="-I$(brew --prefix openssl)/include $CFLAGS"
$ export LDFLAGS="-L$(brew --prefix openssl)/lib $LDFLAGS"
```
이건 맥에서만 쓰는거...ㅋㅋ...




에러천지네..ㅎㅎ



https://steemit.com/kr/@recrack/python-steemit-2-2-warning-urllib3-connectionpool-retrying-error

https://steemit.com/kr/@recrack/python-steemit-2-1-steempy-toml-version-error





{'active': {'account_autos': [],

​            'key_auths': [['STM5Mod7sjz6tufLYg9RG3W5kfA6moYcK2CZ1odoVrTaqW59KJgYy',

​                           1]],

​            'weight_threshold': 1},

 'active_challenged': False,

 'average_bandwidth': '25624021954',

 'average_market_bandwidth': 0,

 'balance': '0.001 STEEM',

 'can_vote': True,

 'comment_count': 0,

 'created': '2018-01-18T12:13:03',

 'curation_rewards': 96,

 'delegated_vesting_shares': '0.000000 VESTS',

 'guest_bloggers': [],

 'id': 611001,

 'json_metadata': '{"profile":{"profile_image":"https://steemitimages.com/DQmRNRoLYQ6L2UX6z7HFiVCMQ5TervPcBnGsGheuxFpZYUY/steemprofile.jpg"}}',

 'last_account_recovery': '1970-01-01T00:00:00',

 'last_account_update': '2018-02-08T05:51:18',

 'last_active_proved': '1970-01-01T00:00:00',

 'last_bandwidth_update': '2018-03-07T03:00:00',

 'last_market_bandwidth_update': '1970-01-01T00:00:00',

 'last_owner_proved': '1970-01-01T00:00:00',

 'last_owner_update': '2018-01-18T12:16:57',

 'last_post': '2018-03-07T03:00:00',

 'last_root_post': '2018-03-06T09:46:06',

 'last_vote_time': '2018-03-07T02:55:30',

 'lifetime_bandwidth': '137189000000',

 'lifetime_market_bandwidth': 0,

 'lifetime_vote_count': 0,

 'market_history': [],

 'memo_key': 'STM5gM7Bgs3PoJEQjmkHs9oBxZVk6duYKpk6upUv7XrmKMfQFtcin',

 'mined': False,

 'name': 'ciceron',

 'next_vesting_withdrawal': '1969-12-31T23:59:59',

 'other_history': [],

 'owner': {'account_auths': [],

​           'key_auths': [['STM7pzw4AjWWp6d41QwdMZZ2y6yVuzobxguFpcB7UToby3Z489erV',

​                          1]],

​           'weight_threshold': 1},

 'owner_challenged': False,

 'post_count': 91,

 'post_history': [],

 'posting': {'account_auths': [],

​             'key_auths': [['STM61niVHbenbHzQP94Gg7EqbG3tGCTv6SoxWPhPWegZgoTFd3Bkb',

​                            1]],

​             'weight_threshold': 1},

 'posting_rewards': 7281,

 'proxied_vsf_votes': [0, 0, 0, 0],

 'proxy': '',

 'received_vesting_shares': '942349.156248 VESTS',

 'recovery_account': 'steem',

 'reputation': '93676959734',

 'reset_account': 'null',

 'reward_sbd_balance': '2.484 SBD',

 'reward_steem_balance': '0.000 STEEM',

 'reward_vesting_balance': '1584.965516 VESTS',

 'reward_vesting_steem': '0.776 STEEM',

 'savings_balance': '0.000 STEEM',

 'savings_sbd_balance': '0.000 SBD',

 'savings_sbd_last_interest_payment': '1970-01-01T00:00:00',

 'savings_sbd_seconds': '0',

 'savings_sbd_seconds_last_update': '1970-01-01T00:00:00',

 'savings_withdraw_requests': 0,

 'sbd_balance': '10.650 SBD',

 'sbd_last_interest_payment': '1970-01-01T00:00:00',

 'sbd_seconds': '0',

 'sbd_seconds_last_update': '2018-03-02T05:10:33',

 'tags_usage': [],

 'to_withdraw': 0,

 'transfer_history': [],

 'vesting_balance': '0.000 STEEM',

 'vesting_shares': '7085.502292 VESTS',

 'vesting_withdraw_rate': '0.000000 VESTS',

 'vote_history': [],

 'voting_power': 9800,

 'withdraw_routes': 0,

 'withdrawn': 0,

 'witness_votes': [],

 'witnesses_voted_for': 0}

Process finished with exit code 0


